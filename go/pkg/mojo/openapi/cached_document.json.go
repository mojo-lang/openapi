package openapi

import (
	jsoniter "github.com/json-iterator/go"
	"github.com/mojo-lang/document/go/pkg/mojo/document"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("openapi.CachedDocument", &CachedDocumentCodec{})
	jsoniter.RegisterTypeEncoder("openapi.CachedDocument", &CachedDocumentCodec{})
}

type CachedDocumentCodec struct {
}

func (codec *CachedDocumentCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	doc := (*CachedDocument)(ptr)
	if any.ValueType() == jsoniter.ObjectValue {
		doc.Value = &document.Document{}
		any.ToVal(doc.Value)
	} else if any.ValueType() == jsoniter.StringValue {
		doc.Cache = any.ToString()
	}
}

func (codec *CachedDocumentCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	doc := (*CachedDocument)(ptr)
	stream.WriteVal(doc.GetStringDocument())
}

func (codec *CachedDocumentCodec) IsEmpty(ptr unsafe.Pointer) bool {
	doc := (*CachedDocument)(ptr)
	return doc == nil || (len(doc.Cache) == 0 && doc.Value == nil)
}
