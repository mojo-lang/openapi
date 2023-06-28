package openapi

import (
	"io/ioutil"
	"testing"

	jsoniter "github.com/json-iterator/go"
	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"github.com/stretchr/testify/assert"
)

func TestOpenAPI_GetOperation(t *testing.T) {
	o := New()
	o.Paths.Vals["/path/to/service"] = &PathItem{
		Get: &Operation{
			OperationId: "test_operation_id",
			Summary:     "test_operation_summary",
		},
		Post: &Operation{
			OperationId: "test_operation_id_2",
			Summary:     "test_operation_2_summary",
		}}

	p, m, api, e := o.GetOperation("test_operation_id")
	assert.NoError(t, e)
	assert.Equal(t, "/path/to/service", p)
	assert.Equal(t, "GET", m)
	assert.Equal(t, "test_operation_summary", api.Summary)
}

func TestOpenAPI_IsVersion(t *testing.T) {
	o := New()
	o.Openapi = &core.Version{Major: 3, Minor: 0, Patch: 3}

	assert.True(t, o.CheckVersion("3"))
	assert.True(t, o.CheckVersion("3.0"))
	assert.True(t, o.CheckVersion("3.0.3"))

	assert.False(t, o.CheckVersion("2"))
	assert.False(t, o.CheckVersion("3.1"))
	assert.False(t, o.CheckVersion("3.0.0"))
}

func TestOpenAPI_SupplementExample(t *testing.T) {
	o := New()
	o.Paths.Vals["/path/to/service"] = &PathItem{
		Get: &Operation{
			Summary: "test_operation_summary",
			Parameters: []*ReferenceableParameter{
				NewReferenceableParameter(&Parameter{
					Name:   "url",
					In:     Parameter_LOCATION_QUERY,
					Schema: NewReferenceableSchema(&Schema{Type: Schema_TYPE_STRING}),
				})},
		}}

	o.SupplementExample()
	assert.NotNil(t, o.GetPath("/path/to/service").GetGet().GetParameter(0, nil).GetExample())
}

func TestOpenAPI_SupplementExample2(t *testing.T) {
	api := &OpenAPI{}
	content, err := ioutil.ReadFile("./testdata/supplement_example_test.json")
	if assert.NoError(t, err) {
		err = jsoniter.Unmarshal(content, api)
		if assert.NoError(t, err) {
			api.SupplementExample()
		}
	}

}
