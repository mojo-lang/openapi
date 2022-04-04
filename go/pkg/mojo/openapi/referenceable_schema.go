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

func (x *ReferenceableSchema) SetSchema(schema *Schema) {
    if x != nil {
        x.ReferenceableSchema = &ReferenceableSchema_Schema{
            Schema: schema,
        }
    }
}

func (x *ReferenceableSchema) SetReference(reference *Reference) {
    if x != nil {
        x.ReferenceableSchema = &ReferenceableSchema_Reference{
            Reference: reference,
        }
    }
}

func (x *ReferenceableSchema) SetReferenceUrl(reference string) {
    if x != nil {
        x.ReferenceableSchema = &ReferenceableSchema_Reference{
            Reference: &Reference{
                Ref: core.NewUrl(reference),
            },
        }
    }
}

func (x *ReferenceableSchema) GetReferenceUrl() *core.Url {
    return x.GetReference().GetRef()
}

func (x *ReferenceableSchema) GetSchemaName() string {
    reference := x.GetReference()
    if reference != nil {
        return reference.GetSchemaName()
    }

    schema := x.GetSchema()
    if schema != nil {
        return schema.Title
    }

    return ""
}

func (x *ReferenceableSchema) GetSchemaOf(index map[string]*Schema) *Schema {
    if x != nil {
        reference := x.GetReference()
        if reference != nil {
            fragment := reference.GetRef().GetFragment()
            key := strings.TrimPrefix(fragment, ReferenceRoot)
            if s, ok := index[key]; ok {
                return s
            }
            return nil
        }
        return x.GetSchema()
    }
    return nil
}

func (x *ReferenceableSchema) GetTypeName(index map[string]*Schema) string {
    s := x.GetSchemaOf(index)
    if s != nil {
        return s.GetTypeName(index)
    }
    return ""
}

func (x *ReferenceableSchema) GetFormat(index map[string]*Schema) string {
    s := x.GetSchemaOf(index)
    if s != nil {
        return s.Format
    }
    return ""
}

func (x *ReferenceableSchema) GetSummary(components *Components) string {
    if summary := x.GetReference().GetSummary(); len(summary) > 0 {
        return summary
    }

    ref := x.GetReferenceUrl()
    if ref != nil {
        return components.GetSchema(ref).GetTitle()
    }

    return x.GetSchema().GetTitle()
}

func (x *ReferenceableSchema) GetDescription(components *Components) *document.Document {
    if document := x.GetReference().GetDescription(); document != nil {
        return document.GetDocument()
    }

    ref := x.GetReferenceUrl()
    if ref != nil {
        return components.GetSchema(ref).GetDescription().GetDocument()
    }

    return x.GetSchema().GetDescription().GetDocument()
}

func (m *Reference) GetSchemaName() string {
    fragment := m.GetRef().GetFragment()
    return strings.TrimPrefix(fragment, ReferenceRoot)
}

func (x *ReferenceableSchema) SetDescription(doc *CachedDocument) {
    if x != nil {
        reference := x.GetReference()
        if reference != nil {
            reference.Description = doc
        }

        schema := x.GetSchema()
        if schema != nil {
            schema.Description = doc
        }
    }
}
