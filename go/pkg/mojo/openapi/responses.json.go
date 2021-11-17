package openapi

import (
	jsoniter "github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("openapi.Responses", &ResponsesCodec{})
	jsoniter.RegisterTypeEncoder("openapi.Responses", &ResponsesCodec{})
}

type ResponsesCodec struct {
}

func (codec *ResponsesCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	responses := (*Responses)(ptr)
	if any.ValueType() == jsoniter.ObjectValue {
		if responses.Values == nil {
			responses.Values = make(map[string]*ReferenceableResponse)
		}
		any.ToVal(&responses.Values)
	}
}

func (codec *ResponsesCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	responses := (*Responses)(ptr)

	if responses != nil && len(responses.Values) > 0 {
		stream.WriteVal(responses.Values)
	}
}

func (codec *ResponsesCodec) IsEmpty(ptr unsafe.Pointer) bool {
	responses := (*Responses)(ptr)
	return responses == nil || len(responses.Values) == 0
}

