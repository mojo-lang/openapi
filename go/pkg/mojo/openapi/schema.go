package openapi

import "bytes"

func (m *Schema) IsPropertyRequired(property string) bool {
	if m != nil {
		for _, r := range m.Required {
			if r == property {
				return true
			}
		}
	}
	return false
}

func (m *Schema) FieldNames(index map[string]*Schema) []string {
	var fieldNames []string
	if m == nil {
		return fieldNames
	}

	if len(m.AllOf) > 0 {
		for _, s := range m.AllOf {
			names := s.GetSchemaOf(index).FieldNames(index)
			fieldNames = append(fieldNames, names...)
		}
		return fieldNames
	}

	for key, _ := range m.Properties {
		fieldNames = append(fieldNames, key)
	}
	return fieldNames
}

func (m *Schema) GetTypeName(index map[string]*Schema) string {
	if m != nil {
		switch m.Type {
		case Schema_TYPE_ARRAY:
			return "Array<" + m.Items.GetTypeName(index) + ">"
		case Schema_TYPE_OBJECT:
			if m.AdditionalProperties != nil {
				return "Map<string, " + m.AdditionalProperties.GetTypeName(index) + ">"
			}
			if len(m.Title) > 0 {
				return m.Title
			}
			return m.Type.Format()
		case Schema_TYPE_UNSPECIFIED:
			if len(m.Title) > 0 {
				return m.Title
			}
			if len(m.OneOf) > 0 { // union type
				buffer := bytes.NewBuffer(make([]byte, 0, 64))
				buffer.WriteString("Union<")
				for i, one := range m.OneOf {
					if i > 0 {
						buffer.WriteByte(',')
					}
					buffer.WriteString(one.GetTypeName(index))
				}
				buffer.WriteString(">")
				return buffer.String()
			}
		default:
			return m.Type.Format()
		}
	}
	return ""
}

func (m *Schema) IsScalar() bool {
	switch m.Type {
	case Schema_TYPE_BOOLEAN, Schema_TYPE_NUMBER, Schema_TYPE_INTEGER, Schema_TYPE_NULL, Schema_TYPE_STRING:
		return true
	}
	return false
}

func (m *Schema) Dependencies(index map[string]*Schema) []*Schema {
	duplicates := make(map[string]bool)
	dependencies := m.dependencies(index, duplicates)

	mask := make(map[string]bool)
	var cleanDeps []*Schema

	for _, schema := range dependencies {
		if _, ok := mask[schema.GetTitle()]; ok {
			continue
		}

		mask[schema.GetTitle()] = true
		cleanDeps = append(cleanDeps, schema)
	}

	return cleanDeps
}

func (m *Schema) appendSchema(schema *ReferenceableSchema, index map[string]*Schema, duplicates map[string]bool) []*Schema {
	var dependencies []*Schema
	s := schema.GetSchemaOf(index)

	if duplicates[s.Title] {
		return dependencies
	}

	if s.Items != nil {
		return m.appendSchema(s.Items, index, duplicates)
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

func (m *Schema) dependencies(index map[string]*Schema, duplicates map[string]bool) []*Schema {
	var dependencies []*Schema

	if m == nil {
		return dependencies
	}

	if m.Type == Schema_TYPE_ARRAY {
		dependencies = append(dependencies, m.appendSchema(m.Items, index, duplicates)...)
	} else if m.Type == Schema_TYPE_OBJECT {
		if m.AdditionalProperties != nil { // map
			dependencies = append(dependencies, m.appendSchema(m.AdditionalProperties, index, duplicates)...)
		} else {
			for _, property := range m.Properties {
				dependencies = append(dependencies, m.appendSchema(property, index, duplicates)...)
			}
		}
	} else if len(m.AllOf) > 0 {
		for _, item := range m.AllOf {
			schema := item.GetSchemaOf(index)
			if !schema.IsScalar() {
				ds := schema.dependencies(index, duplicates)
				if len(ds) > 0 {
					dependencies = append(dependencies, ds...)
				}
			}
		}
	} else if len(m.OneOf) > 0 {
		for _, s := range m.OneOf {
			dependencies = append(dependencies, m.appendSchema(s, index, duplicates)...)
		}
	}

	return dependencies
}
