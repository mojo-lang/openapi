package openapi

import "github.com/mojo-lang/core/go/pkg/mojo/core"

func (x *MediaType) GenerateExample(index map[string]*Schema, mediaType string) {
	if x != nil {
		if example := x.generateExample(index, mediaType); example != nil {
			x.Example = example
		}
	}
}

func (x *MediaType) SupplementExample(index map[string]*Schema, mediaType string) {
	if x != nil && x.Example == nil && len(x.Examples) == 0 {
		if x.Schema.GetSchema() == nil || x.Schema.GetSchema().Example == nil {
			x.Example = x.generateExample(index, mediaType)
		}
	}
}

func (x *MediaType) generateExample(index map[string]*Schema, mediaType string) *core.Value {
	if x != nil {
		if example := x.Schema.GetSchemaOf(index).GenerateExample(index); example != nil {
			switch mediaType {
			case core.ApplicationJson:
				return example
			case core.ApplicationWwwFormUrlencoded:
			}
		}
	}
	return nil
}
