package openapi

import (
	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"github.com/mojo-lang/document/go/pkg/mojo/document"
	"strings"
)

const ReferenceRoot = "/components/schemas/"

func NewReferenceableSchema(schema *Schema) *ReferenceableSchema {
	s := &ReferenceableSchema{}
	s.SetSchema(schema)
	return s
}

func NewReferencedSchema(reference *Reference) *ReferenceableSchema {
	s := &ReferenceableSchema{}
	s.SetReference(reference)
	return s
}

func (m *ReferenceableSchema) SetSchema(schema *Schema) {
	if m != nil {
		m.ReferenceableSchema = &ReferenceableSchema_Schema{
			Schema: schema,
		}
	}
}

func (m *ReferenceableSchema) SetReference(reference *Reference) {
	if m != nil {
		m.ReferenceableSchema = &ReferenceableSchema_Reference{
			Reference: reference,
		}
	}
}

func (m *ReferenceableSchema) SetReferenceUrl(reference string) {
	if m != nil {
		m.ReferenceableSchema = &ReferenceableSchema_Reference{
			Reference: &Reference{
				Ref: core.NewUrl(reference),
			},
		}
	}
}

func (m *ReferenceableSchema) GetReferenceUrl() *core.Url {
	return m.GetReference().GetRef()
}

func (m *ReferenceableSchema) GetSchemaName() string {
	reference := m.GetReference()
	if reference != nil {
		return reference.GetSchemaName()
	}

	schema := m.GetSchema()
	if schema != nil {
		return schema.Title
	}

	return ""
}

func (m *ReferenceableSchema) GetSchemaOf(index map[string]*Schema) *Schema {
	if m != nil {
		reference := m.GetReference()
		if reference != nil {
			fragment := reference.GetRef().GetFragment()
			key := strings.TrimPrefix(fragment, ReferenceRoot)
			if s, ok := index[key]; ok {
				return s
			}
			return nil
		}
		return m.GetSchema()
	}
	return nil
}

func (m *ReferenceableSchema) GetTypeName(index map[string]*Schema) string {
	s := m.GetSchemaOf(index)
	if s != nil {
		return s.GetTypeName(index)
	}
	return ""
}

func (m *ReferenceableSchema) GetFormat(index map[string]*Schema) string {
	s := m.GetSchemaOf(index)
	if s != nil {
		return s.Format
	}
	return ""
}

func (m *ReferenceableSchema) GetSummary(components *Components) string {
	if summary := m.GetReference().GetSummary(); len(summary) > 0 {
		return summary
	}

	ref := m.GetReferenceUrl()
	if ref != nil {
		return components.GetSchema(ref).GetTitle()
	}

	return m.GetSchema().GetTitle()
}

func (m *ReferenceableSchema) GetDescription(components *Components) *document.Document {
	if document := m.GetReference().GetDescription(); document != nil {
		return document.GetDocument()
	}

	ref := m.GetReferenceUrl()
	if ref != nil {
		return components.GetSchema(ref).GetDescription().GetDocument()
	}

	return m.GetSchema().GetDescription().GetDocument()
}

func (m *Reference) GetSchemaName() string {
	fragment := m.GetRef().GetFragment()
	return strings.TrimPrefix(fragment, ReferenceRoot)
}

func (m *ReferenceableSchema) SetDescription(doc *CachedDocument) {
	if m != nil {
		reference := m.GetReference()
		if reference != nil {
			reference.Description = doc
		}

		schema := m.GetSchema()
		if schema != nil {
			schema.Description = doc
		}
	}
}
