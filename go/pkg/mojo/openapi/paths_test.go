package openapi

import (
	jsoniter "github.com/json-iterator/go"
	"github.com/stretchr/testify/assert"
	"testing"
)

func TestPathsCodec_Decode(t *testing.T) {
	paths := &Paths{Values: map[string]*PathItem{
		"/foo/bar": {Get: &Operation{Summary: "foo.bar"}},
	}}

	str, err := jsoniter.MarshalToString(paths)
	assert.NoError(t, err)

	ps := &Paths{}
	err = jsoniter.UnmarshalFromString(str, ps)
	assert.NoError(t, err)
	assert.Equal(t, paths.Values["/foo/bar"].Get.Summary, ps.Values["/foo/bar"].Get.Summary)
}
