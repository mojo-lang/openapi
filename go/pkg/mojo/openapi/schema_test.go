package openapi

import (
	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"github.com/stretchr/testify/assert"
	"testing"
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
