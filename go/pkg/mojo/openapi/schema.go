package openapi

import (
	"bytes"
	"fmt"
	"github.com/brianvoe/gofakeit/v6"
	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"google.golang.org/protobuf/proto"
	"sort"
)

func (x *Schema) ValidateExample(index map[string]*Schema) error {
	if x != nil {
		if x.Example == nil {
			return nil
		}
		return x.ValidateValue(x.Example, index)
	}
	return nil
}

func (x *Schema) ValidateValue(value *core.Value, index map[string]*Schema) error {
	if x != nil {
		if value == nil {
			return nil
		}

		switch x.Type {
		case Schema_TYPE_NULL:
			if value.GetKind() == core.ValueKind_VALUE_KIND_NULL {
				return nil
			} else {
				return fmt.Errorf("the example value type should only be null")
			}
		case Schema_TYPE_BOOLEAN:
			if value.GetKind() == core.ValueKind_VALUE_KIND_BOOLEAN {
				return nil
			} else {
				return fmt.Errorf("the example value type should only be boolean")
			}
		case Schema_TYPE_INTEGER:
			//TODO add min max check
			if value.GetKind() == core.ValueKind_VALUE_KIND_INTEGER {
				return nil
			} else {
				return fmt.Errorf("the example value type should only be integer")
			}
		case Schema_TYPE_NUMBER:
			if value.GetKind() == core.ValueKind_VALUE_KIND_NUMBER {
				return nil
			} else {
				return fmt.Errorf("the example value type should only be number")
			}
		case Schema_TYPE_STRING:
			//TODO add pattern check
			if value.GetKind() == core.ValueKind_VALUE_KIND_STRING || value.GetKind() == core.ValueKind_VALUE_KIND_BYTES {
				return nil
			} else {
				return fmt.Errorf("the example value type should only be string")
			}
		case Schema_TYPE_ARRAY:
			if value.GetKind() == core.ValueKind_VALUE_KIND_ARRAY {
				vs := value.GetValues()
				for _, v := range vs {
					s := x.Items.GetSchemaOf(index)
					if err := s.ValidateValue(v, index); err != nil {
						return err
					}
				}
				return nil
			} else {
				return fmt.Errorf("the example value type should only be array")
			}
		case Schema_TYPE_OBJECT:
			if value.GetKind() == core.ValueKind_VALUE_KIND_OBJECT {
				vs := value.GetObject().ToMap().(map[string]*core.Value)
				if len(x.Properties) > 0 { // struct
					for k, v := range vs {
						if s, ok := x.Properties[k]; ok {
							sch := s.GetSchemaOf(index)
							if err := sch.ValidateValue(v, index); err != nil {
								return err
							}
						} else {
							//unknown field will be skipped
							//return fmt.Errorf("unknown field %s", k)
						}
					}

					// check required fields
					for _, r := range x.Required {
						if _, ok := vs[r]; !ok {
							return fmt.Errorf("the required filed %s is not found", r)
						}
					}
				} else if x.AdditionalProperties != nil { // map
					s := x.AdditionalProperties.GetSchemaOf(index)
					for _, v := range vs {
						if err := s.ValidateValue(v, index); err != nil {
							return err
						}
					}
				}
				return nil
			} else {
				return fmt.Errorf("the example value type should only be object")
			}
		}
	}
	return nil
}

func (x *Schema) IsPropertyRequired(property string) bool {
	if x != nil {
		for _, r := range x.Required {
			if r == property {
				return true
			}
		}
	}
	return false
}

func (x *Schema) FieldNames(index map[string]*Schema) []string {
	var fieldNames []string
	if x == nil {
		return fieldNames
	}

	if len(x.AllOf) > 0 {
		for _, s := range x.AllOf {
			names := s.GetSchemaOf(index).FieldNames(index)
			fieldNames = append(fieldNames, names...)
		}
		return fieldNames
	}

	for key := range x.Properties {
		fieldNames = append(fieldNames, key)
	}
	return fieldNames
}

func (x *Schema) GetTypeName(index map[string]*Schema) string {
	if x != nil {
		switch x.Type {
		case Schema_TYPE_ARRAY:
			if x.Items == nil { // array<Value> type
				return "array"
			}
			return "Array<" + x.Items.GetTypeName(index) + ">"
		case Schema_TYPE_OBJECT:
			if x.AdditionalProperties != nil {
				return "Map<string, " + x.AdditionalProperties.GetTypeName(index) + ">"
			}
			if len(x.Title) > 0 {
				return x.Title
			}
			return x.Type.Format()
		case Schema_TYPE_UNSPECIFIED:
			if len(x.Title) > 0 {
				return x.Title
			}
			if len(x.OneOf) > 0 { // union type
				buffer := bytes.NewBuffer(make([]byte, 0, 64))
				buffer.WriteString("Union<")
				for i, one := range x.OneOf {
					if i > 0 {
						buffer.WriteByte(',')
					}
					buffer.WriteString(one.GetTypeName(index))
				}
				buffer.WriteString(">")
				return buffer.String()
			}
		default:
			return x.Type.Format()
		}
	}
	return ""
}

func (x *Schema) IsScalar() bool {
	if x != nil {
		switch x.Type {
		case Schema_TYPE_BOOLEAN, Schema_TYPE_NUMBER, Schema_TYPE_INTEGER, Schema_TYPE_NULL, Schema_TYPE_STRING:
			return true
		}
	}

	return false
}

func (x *Schema) IsEmpty() bool {
	return x != nil && (x.Type == Schema_TYPE_UNSPECIFIED &&
		len(x.Enum) == 0 &&
		len(x.AllOf) == 0 &&
		len(x.OneOf) == 0 &&
		len(x.AnyOf) == 0 &&
		x.Not == nil)
}

func (x *Schema) Clone() *Schema {
	return proto.Clone(x).(*Schema)
}

func (x *Schema) Dependencies(index map[string]*Schema) []*Schema {
	duplicates := make(map[string]bool)
	dependencies := x.dependencies(index, duplicates)

	mask := make(map[string]bool)
	var cleanDeps []*Schema

	for _, schema := range dependencies {
		if _, ok := mask[schema.GetTitle()]; ok {
			continue
		}

		mask[schema.GetTitle()] = true
		cleanDeps = append(cleanDeps, schema)
	}

	sort.Sort(Schemas(cleanDeps))
	return cleanDeps
}

func (x *Schema) appendSchema(schema *ReferenceableSchema, index map[string]*Schema, duplicates map[string]bool) []*Schema {
	var dependencies []*Schema
	s := schema.GetSchemaOf(index)

	if duplicates[s.Title] {
		return dependencies
	}

	if s.Items != nil {
		return x.appendSchema(s.Items, index, duplicates)
	}

	if !s.IsScalar() {
		dependencies = append(dependencies, s)
		duplicates[s.Title] = true

		ds := s.dependencies(index, duplicates)
		if len(ds) > 0 {
			dependencies = append(dependencies, ds...)
		}
		for _, dep := range ds {
			duplicates[dep.Title] = true
		}
	}
	return dependencies
}

func (x *Schema) dependencies(index map[string]*Schema, duplicates map[string]bool) []*Schema {
	var dependencies []*Schema

	if x.Type == Schema_TYPE_ARRAY {
		if x.Title != core.ValuesTypeFullName {
			dependencies = append(dependencies, x.appendSchema(x.Items, index, duplicates)...)
		}
	} else if x.Type == Schema_TYPE_OBJECT {
		if x.AdditionalProperties != nil { // map
			dependencies = append(dependencies, x.appendSchema(x.AdditionalProperties, index, duplicates)...)
		} else {
			for _, property := range x.Properties {
				dependencies = append(dependencies, x.appendSchema(property, index, duplicates)...)
			}
		}
	} else if len(x.AllOf) > 0 {
		for _, item := range x.AllOf {
			schema := item.GetSchemaOf(index)
			if !schema.IsScalar() {
				ds := schema.dependencies(index, duplicates)
				if len(ds) > 0 {
					dependencies = append(dependencies, ds...)
				}
			}
		}
	} else if len(x.OneOf) > 0 {
		for _, s := range x.OneOf {
			dependencies = append(dependencies, x.appendSchema(s, index, duplicates)...)
		}
	}

	return dependencies
}

func (x *Schema) GenerateExample(index map[string]*Schema) *core.Value {
	return x.generateExample(index, make(core.Options))
}

func (x *Schema) generateExample(index map[string]*Schema, options core.Options) *core.Value {
	if x != nil {
		//if x.Example != nil {
		//    return x.Example
		//}
		switch x.Type {
		case Schema_TYPE_NULL:
		case Schema_TYPE_BOOLEAN:
			return core.NewBoolValue(gofakeit.Bool())
		case Schema_TYPE_INTEGER:
			switch x.Format {
			case "int32", "Int32", "core.Int32", "mojo.core.Int32":
				return core.NewInt32Value(gofakeit.Int32())
			case "int64", "Int64", "core.Int64", "mojo.core.Int64":
				return core.NewInt64Value(gofakeit.Int64())
			case "uint32", "UInt32", "core.UInt32", "mojo.core.UInt32":
				return core.NewUInt32Value(gofakeit.Uint32())
			case "uint64", "UInt64", "core.UInt64", "mojo.core.UInt64":
				return core.NewUInt64Value(gofakeit.Uint64())
			default:
				return core.NewInt32Value(gofakeit.Int32())
			}
		case Schema_TYPE_NUMBER:
			return core.NewFloat64Value(gofakeit.Float64())
		case Schema_TYPE_STRING:
			return core.NewStringValue(x.generateStringExample(options))
		case Schema_TYPE_ARRAY:
			var values []*core.Value
			for i := 0; i < 3; i++ {
				if value := x.Items.GetSchemaOf(index).generateExample(index, options); value != nil {
					values = append(values, value)
				}
			}
			return core.NewArrayValue(values...)
		case Schema_TYPE_OBJECT:
			if x.AdditionalProperties != nil { // map
				values := make(map[string]*core.Value)
				for i := 0; i < 3; i++ {
					if value := x.AdditionalProperties.GetSchemaOf(index).generateExample(index, options); value != nil {
						key := gofakeit.Name()
						for j := 0; j < 100; j++ {
							if _, ok := values[key]; !ok {
								break
							}
							key = gofakeit.Name()
						}
						values[key] = value
					}
				}
				return core.NewMapValue(values)
			} else {
				values := make(map[string]interface{})
				for key, value := range x.Properties {
					options["label"] = key
					if v := value.GetSchemaOf(index).generateExample(index, options); v != nil {
						values[key] = v
					}
				}
				delete(options, "label")

				obj, _ := core.NewObjectFromMap(values)
				return core.NewObjectValue(obj)
			}
		}
	}
	return nil
}

func (x *Schema) generateStringExample(options core.Options) string {
	return gofakeit.BuzzWord()
}
