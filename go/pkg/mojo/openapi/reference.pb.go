// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/openapi/reference.proto

package openapi

import (
	_ "github.com/mojo-lang/core/go/pkg/mojo"
	core "github.com/mojo-lang/core/go/pkg/mojo/core"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type Reference struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Ref         *core.Url       `protobuf:"bytes,1,opt,name=ref,proto3" json:"ref,omitempty"`
	Summary     string          `protobuf:"bytes,2,opt,name=summary,proto3" json:"summary,omitempty"`
	Description *CachedDocument `protobuf:"bytes,3,opt,name=description,proto3" json:"description,omitempty"`
}

func (x *Reference) Reset() {
	*x = Reference{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_openapi_reference_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Reference) ToText() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Reference) ProtoMessage() {}

func (x *Reference) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_openapi_reference_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Reference.ProtoReflect.Descriptor instead.
func (*Reference) Descriptor() ([]byte, []int) {
	return file_mojo_openapi_reference_proto_rawDescGZIP(), []int{0}
}

func (x *Reference) GetRef() *core.Url {
	if x != nil {
		return x.Ref
	}
	return nil
}

func (x *Reference) GetSummary() string {
	if x != nil {
		return x.Summary
	}
	return ""
}

func (x *Reference) GetDescription() *CachedDocument {
	if x != nil {
		return x.Description
	}
	return nil
}

var File_mojo_openapi_reference_proto protoreflect.FileDescriptor

var file_mojo_openapi_reference_proto_rawDesc = []byte{
	0x0a, 0x1c, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2f, 0x72,
	0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x1a, 0x13, 0x6d, 0x6f,
	0x6a, 0x6f, 0x2f, 0x63, 0x6f, 0x72, 0x65, 0x2f, 0x75, 0x72, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x0f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x22, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69,
	0x2f, 0x63, 0x61, 0x63, 0x68, 0x65, 0x64, 0x5f, 0x64, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x91, 0x01, 0x0a, 0x09, 0x52, 0x65, 0x66, 0x65, 0x72,
	0x65, 0x6e, 0x63, 0x65, 0x12, 0x2a, 0x0a, 0x03, 0x72, 0x65, 0x66, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x0e, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x63, 0x6f, 0x72, 0x65, 0x2e, 0x55, 0x72,
	0x6c, 0x42, 0x08, 0xca, 0xcf, 0x24, 0x04, 0x24, 0x72, 0x65, 0x66, 0x52, 0x03, 0x72, 0x65, 0x66,
	0x12, 0x18, 0x0a, 0x07, 0x73, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x07, 0x73, 0x75, 0x6d, 0x6d, 0x61, 0x72, 0x79, 0x12, 0x3e, 0x0a, 0x0b, 0x64, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x1c, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2e, 0x43,
	0x61, 0x63, 0x68, 0x65, 0x64, 0x44, 0x6f, 0x63, 0x75, 0x6d, 0x65, 0x6e, 0x74, 0x52, 0x0b, 0x64,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x42, 0x67, 0x0a, 0x19, 0x6f, 0x72,
	0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e,
	0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x42, 0x0e, 0x52, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e,
	0x63, 0x65, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x38, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f,
	0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x6d,
	0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x3b, 0x6f, 0x70, 0x65, 0x6e,
	0x61, 0x70, 0x69, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_openapi_reference_proto_rawDescOnce sync.Once
	file_mojo_openapi_reference_proto_rawDescData = file_mojo_openapi_reference_proto_rawDesc
)

func file_mojo_openapi_reference_proto_rawDescGZIP() []byte {
	file_mojo_openapi_reference_proto_rawDescOnce.Do(func() {
		file_mojo_openapi_reference_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_openapi_reference_proto_rawDescData)
	})
	return file_mojo_openapi_reference_proto_rawDescData
}

var file_mojo_openapi_reference_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_openapi_reference_proto_goTypes = []interface{}{
	(*Reference)(nil),      // 0: mojo.openapi.Reference
	(*core.Url)(nil),       // 1: mojo.core.Url
	(*CachedDocument)(nil), // 2: mojo.openapi.CachedDocument
}
var file_mojo_openapi_reference_proto_depIdxs = []int32{
	1, // 0: mojo.openapi.Reference.ref:type_name -> mojo.core.Url
	2, // 1: mojo.openapi.Reference.description:type_name -> mojo.openapi.CachedDocument
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_mojo_openapi_reference_proto_init() }
func file_mojo_openapi_reference_proto_init() {
	if File_mojo_openapi_reference_proto != nil {
		return
	}
	file_mojo_openapi_cached_document_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_openapi_reference_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Reference); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_mojo_openapi_reference_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_openapi_reference_proto_goTypes,
		DependencyIndexes: file_mojo_openapi_reference_proto_depIdxs,
		MessageInfos:      file_mojo_openapi_reference_proto_msgTypes,
	}.Build()
	File_mojo_openapi_reference_proto = out.File
	file_mojo_openapi_reference_proto_rawDesc = nil
	file_mojo_openapi_reference_proto_goTypes = nil
	file_mojo_openapi_reference_proto_depIdxs = nil
}
