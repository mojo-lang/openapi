package openapi

import (
    "github.com/stretchr/testify/assert"
    "testing"
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
