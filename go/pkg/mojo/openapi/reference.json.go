package openapi

import (
	jsoniter "github.com/json-iterator/go"
	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"io"
	"unsafe"
)

func init() {
	jsoniter.RegisterTypeDecoder("openapi.Reference", &ReferenceCodec{})
	jsoniter.RegisterTypeEncoder("openapi.Reference", &ReferenceCodec{})
}

type ReferenceCodec struct {
}

func (codec *ReferenceCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	r := (*Reference)(ptr)
	if any.ValueType() == jsoniter.ObjectValue {
		ref := any.Get("$ref").ToString()
		r.Ref = core.NewUrl(ref)
	}
}

func (codec *ReferenceCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	reference := (*Reference)(ptr)

	if reference != nil && reference.Ref != nil {
		stream.WriteObjectStart()
		stream.WriteObjectField("$ref")
		stream.WriteString(reference.Ref.Format())

		if len(reference.Summary) > 0 {
			stream.WriteMore()
			stream.WriteObjectField("summary")
			stream.WriteVal(reference.Summary)
		}

		stream.WriteObjectEnd()

		if stream.Error != nil && stream.Error != io.EOF {
			//stream.Error = fmt.Errorf("%v.%s", encoder.typ, stream.Error.Error())
		}
	}
}

func (codec *ReferenceCodec) IsEmpty(ptr unsafe.Pointer) bool {
	return ((*Reference)(ptr)).Ref == nil
}
