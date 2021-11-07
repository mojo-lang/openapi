package openapi

import (
	jsoniter "github.com/json-iterator/go"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("openapi.Parameter_Location", &ParameterLocationCodec{})
	jsoniter.RegisterTypeEncoder("openapi.Parameter_Location", &ParameterLocationCodec{})
}

type ParameterLocationCodec struct {
}

func (codec *ParameterLocationCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	location := (*Parameter_Location)(ptr)
	if any.ValueType() == jsoniter.StringValue {
		switch any.ToString() {
		case "path":
			*location = Parameter_LOCATION_PATH
		case "query":
			*location = Parameter_LOCATION_QUERY
		}
	}
}

func (codec *ParameterLocationCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	location := (*Parameter_Location)(ptr)
	switch *location {
	case Parameter_LOCATION_PATH:
		stream.WriteString("path")
	case Parameter_LOCATION_QUERY:
		stream.WriteString("query")
	}
}

func (codec *ParameterLocationCodec) IsEmpty(ptr unsafe.Pointer) bool {
	location := (*Parameter_Location)(ptr)
	return location != nil && *location == 0
}
