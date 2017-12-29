package openapi

import (
	jsoniter "github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("openapi.Paths", &PathsCodec{})
	jsoniter.RegisterTypeEncoder("openapi.Paths", &PathsCodec{})
}

type PathsCodec struct {
}

func (codec *PathsCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	paths := (*Paths)(ptr)
	if any.ValueType() == jsoniter.ObjectValue {
		if paths.Values == nil {
			paths.Values = make(map[string]*PathItem)
		}
		any.ToVal(&paths.Values)
	}
}

func (codec *PathsCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	paths := (*Paths)(ptr)

	if paths != nil && len(paths.Values) > 0 {
		stream.WriteVal(paths.Values)
	}
}

func (codec *PathsCodec) IsEmpty(ptr unsafe.Pointer) bool {
	paths := (*Paths)(ptr)
	return paths == nil || len(paths.Values) == 0
}
