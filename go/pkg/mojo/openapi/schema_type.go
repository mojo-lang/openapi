package openapi

import (
	jsoniter "github.com/json-iterator/go"
	"strconv"
	"unsafe"
)

var SchemaTypeNames = map[int32]string{
	1: "null",
	2: "integer",
	3: "number",
	4: "string",
	5: "boolean",
	6: "array",
	7: "object",
}

var SchemaTypeValues = map[string]Schema_Type{
	"unspecified": Schema_TYPE_UNSPECIFIED,
	"null":        Schema_TYPE_NULL,
	"integer":     Schema_TYPE_INTEGER,
	"number":      Schema_TYPE_NUMBER,
	"string":      Schema_TYPE_STRING,
	"boolean":     Schema_TYPE_BOOLEAN,
	"array":       Schema_TYPE_ARRAY,
	"object":      Schema_TYPE_OBJECT,
}

func (x Schema_Type) Format() string {
	s, ok := SchemaTypeNames[int32(x)]
	if ok {
		return s
	}
	return strconv.Itoa(int(x))
}

func (x *Schema_Type) Parse(value string) {
	if x != nil {
		s, ok := SchemaTypeValues[value]
		if ok {
			*x = s
		} else {
			*x = Schema_TYPE_UNSPECIFIED
		}
	} else {
		*x = Schema_TYPE_UNSPECIFIED
	}
}

func init() {
	jsoniter.RegisterTypeDecoder("openapi.Schema_Type", &SchemaTypeCodec{})
	jsoniter.RegisterTypeEncoder("openapi.Schema_Type", &SchemaTypeCodec{})
}

type SchemaTypeCodec struct {
}

func (codec *SchemaTypeCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	t := (*Schema_Type)(ptr)
	if any.ValueType() == jsoniter.StringValue {
		t.Parse(any.ToString())
	}
}

func (codec *SchemaTypeCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	t := (*Schema_Type)(ptr)
	stream.WriteString(t.Format())
}

func (codec *SchemaTypeCodec) IsEmpty(ptr unsafe.Pointer) bool {
	s := (*Schema_Type)(ptr)
	return s == nil || *s == 0
}
