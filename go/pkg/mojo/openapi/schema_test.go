package openapi

import (
	"testing"

	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"github.com/stretchr/testify/assert"
)

func TestSchema_ValidateValue(t *testing.T) {
	schema := &Schema{Type: Schema_TYPE_INTEGER}
	intv := core.NewInt32Value(100)
	strv := core.NewStringValue("foo")

	assert.NoError(t, schema.ValidateValue(intv, nil))
	assert.Error(t, schema.ValidateValue(strv, nil))
}

func TestSchema_ValidateExample(t *testing.T) {
	iSchema := &Schema{Type: Schema_TYPE_INTEGER, Example: core.NewInt32Value(100)}
	sSchema := &Schema{Type: Schema_TYPE_INTEGER, Example: core.NewStringValue("foo")}

	assert.NoError(t, iSchema.ValidateExample(nil))
	assert.Error(t, sSchema.ValidateExample(nil))
}

func TestSchema_GenerateExample(t *testing.T) {
	schema := &Schema{Type: Schema_TYPE_INTEGER}
	v := schema.GenerateExample(nil)
	assert.NotNil(t, v)
	assert.Equal(t, core.ValueKind_VALUE_KIND_INTEGER, v.GetKind())

	schema = &Schema{Type: Schema_TYPE_NUMBER}
	v = schema.GenerateExample(nil)
	assert.NotNil(t, v)
	assert.Equal(t, core.ValueKind_VALUE_KIND_NUMBER, v.GetKind())

	schema = &Schema{Type: Schema_TYPE_STRING}
	v = schema.GenerateExample(nil)
	assert.NotNil(t, v)
	assert.Equal(t, core.ValueKind_VALUE_KIND_STRING, v.GetKind())

	schema = &Schema{Type: Schema_TYPE_OBJECT, Properties: map[string]*ReferenceableSchema{
		"foo": NewReferenceableSchema(&Schema{Type: Schema_TYPE_INTEGER}),
		"bar": NewReferenceableSchema(&Schema{Type: Schema_TYPE_STRING}),
	}}
	v = schema.GenerateExample(nil)
	assert.NotNil(t, v)
	assert.Equal(t, core.ValueKind_VALUE_KIND_OBJECT, v.GetKind())
	assert.Equal(t, core.ValueKind_VALUE_KIND_INTEGER, v.GetObject().GetValue("foo").GetKind())
	assert.Equal(t, core.ValueKind_VALUE_KIND_STRING, v.GetObject().GetValue("bar").GetKind())
}

func TestSchema_SupplementExample(t *testing.T) {
	schema := &Schema{Type: Schema_TYPE_OBJECT, Properties: map[string]*ReferenceableSchema{
		"foo": NewReferenceableSchema(&Schema{Type: Schema_TYPE_INTEGER}),
		"bar": NewReferenceableSchema(&Schema{Type: Schema_TYPE_STRING, Example: core.NewStringValue("baz")}),
	}}
	v := schema.SupplementExample(nil)
	assert.NotNil(t, v)
	assert.Equal(t, core.ValueKind_VALUE_KIND_OBJECT, v.GetKind())
	assert.Equal(t, core.ValueKind_VALUE_KIND_INTEGER, v.GetObject().GetValue("foo").GetKind())
	assert.Equal(t, core.ValueKind_VALUE_KIND_STRING, v.GetObject().GetValue("bar").GetKind())
	assert.Equal(t, "baz", v.GetObject().GetValue("bar").GetString())
}
