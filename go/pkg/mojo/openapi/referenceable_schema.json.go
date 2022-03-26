package openapi

import (
    jsoniter "github.com/json-iterator/go"
    "unsafe"
)

func init() {
    jsoniter.RegisterTypeDecoder("openapi.ReferenceableSchema", &ReferenceableSchemaCodec{})
    jsoniter.RegisterTypeEncoder("openapi.ReferenceableSchema", &ReferenceableSchemaCodec{})
}

type ReferenceableSchemaCodec struct {
}

func (codec *ReferenceableSchemaCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
    any := iter.ReadAny()
    schema := (*ReferenceableSchema)(ptr)
    if any.ValueType() == jsoniter.ObjectValue {
        if any.Get("$ref") != nil {
            r := &Reference{}
            any.ToVal(r)
            schema.SetReference(r)
        } else {
            s := &Schema{}
            any.ToVal(s)
            schema.SetSchema(s)
        }
    }
}

func (codec *ReferenceableSchemaCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
    schema := (*ReferenceableSchema)(ptr)
    if s := schema.GetSchema(); s != nil {
        stream.WriteVal(s)
    } else if r := schema.GetReference(); r != nil {
        stream.WriteVal(r)
    }
}

func (codec *ReferenceableSchemaCodec) IsEmpty(ptr unsafe.Pointer) bool {
    return ((*ReferenceableSchema)(ptr)).ReferenceableSchema == nil
}
