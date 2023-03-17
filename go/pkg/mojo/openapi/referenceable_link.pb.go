// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/openapi/referenceable_link.proto

package openapi

import (
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

type ReferenceableLink struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to ReferenceableLink:
	//	*ReferenceableLink_Reference
	//	*ReferenceableLink_Link
	ReferenceableLink isReferenceableLink_ReferenceableLink `protobuf_oneof:"referenceable_link" json:"referenceableLink,omitempty"`
}

func (x *ReferenceableLink) Reset() {
	*x = ReferenceableLink{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_openapi_referenceable_link_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ReferenceableLink) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ReferenceableLink) ProtoMessage() {}

func (x *ReferenceableLink) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_openapi_referenceable_link_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ReferenceableLink.ProtoReflect.Descriptor instead.
func (*ReferenceableLink) Descriptor() ([]byte, []int) {
	return file_mojo_openapi_referenceable_link_proto_rawDescGZIP(), []int{0}
}

func (m *ReferenceableLink) GetReferenceableLink() isReferenceableLink_ReferenceableLink {
	if m != nil {
		return m.ReferenceableLink
	}
	return nil
}

func (x *ReferenceableLink) GetReference() *Reference {
	if x, ok := x.GetReferenceableLink().(*ReferenceableLink_Reference); ok {
		return x.Reference
	}
	return nil
}

func (x *ReferenceableLink) GetLink() *Link {
	if x, ok := x.GetReferenceableLink().(*ReferenceableLink_Link); ok {
		return x.Link
	}
	return nil
}

type isReferenceableLink_ReferenceableLink interface {
	isReferenceableLink_ReferenceableLink()
}

type ReferenceableLink_Reference struct {
	Reference *Reference `protobuf:"bytes,1,opt,name=reference,proto3,oneof" json:"reference,omitempty"`
}

type ReferenceableLink_Link struct {
	Link *Link `protobuf:"bytes,2,opt,name=link,proto3,oneof" json:"link,omitempty"`
}

func (*ReferenceableLink_Reference) isReferenceableLink_ReferenceableLink() {}

func (*ReferenceableLink_Link) isReferenceableLink_ReferenceableLink() {}

var File_mojo_openapi_referenceable_link_proto protoreflect.FileDescriptor

var file_mojo_openapi_referenceable_link_proto_rawDesc = []byte{
	0x0a, 0x25, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2f, 0x72,
	0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x6c, 0x69, 0x6e,
	0x6b, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6f, 0x70,
	0x65, 0x6e, 0x61, 0x70, 0x69, 0x1a, 0x17, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e,
	0x61, 0x70, 0x69, 0x2f, 0x6c, 0x69, 0x6e, 0x6b, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2f, 0x72, 0x65, 0x66,
	0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8c, 0x01, 0x0a,
	0x11, 0x52, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x61, 0x62, 0x6c, 0x65, 0x4c, 0x69,
	0x6e, 0x6b, 0x12, 0x37, 0x0a, 0x09, 0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6f, 0x70, 0x65,
	0x6e, 0x61, 0x70, 0x69, 0x2e, 0x52, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x48, 0x00,
	0x52, 0x09, 0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x12, 0x28, 0x0a, 0x04, 0x6c,
	0x69, 0x6e, 0x6b, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2e, 0x4c, 0x69, 0x6e, 0x6b, 0x48, 0x00, 0x52,
	0x04, 0x6c, 0x69, 0x6e, 0x6b, 0x42, 0x14, 0x0a, 0x12, 0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e,
	0x63, 0x65, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x6c, 0x69, 0x6e, 0x6b, 0x42, 0x6f, 0x0a, 0x19, 0x6f,
	0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f,
	0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x42, 0x16, 0x52, 0x65, 0x66, 0x65, 0x72, 0x65,
	0x6e, 0x63, 0x65, 0x61, 0x62, 0x6c, 0x65, 0x4c, 0x69, 0x6e, 0x6b, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x50, 0x01, 0x5a, 0x38, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d,
	0x6f, 0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69,
	0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65,
	0x6e, 0x61, 0x70, 0x69, 0x3b, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_openapi_referenceable_link_proto_rawDescOnce sync.Once
	file_mojo_openapi_referenceable_link_proto_rawDescData = file_mojo_openapi_referenceable_link_proto_rawDesc
)

func file_mojo_openapi_referenceable_link_proto_rawDescGZIP() []byte {
	file_mojo_openapi_referenceable_link_proto_rawDescOnce.Do(func() {
		file_mojo_openapi_referenceable_link_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_openapi_referenceable_link_proto_rawDescData)
	})
	return file_mojo_openapi_referenceable_link_proto_rawDescData
}

var file_mojo_openapi_referenceable_link_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_openapi_referenceable_link_proto_goTypes = []interface{}{
	(*ReferenceableLink)(nil), // 0: mojo.openapi.ReferenceableLink
	(*Reference)(nil),         // 1: mojo.openapi.Reference
	(*Link)(nil),              // 2: mojo.openapi.Link
}
var file_mojo_openapi_referenceable_link_proto_depIdxs = []int32{
	1, // 0: mojo.openapi.ReferenceableLink.reference:type_name -> mojo.openapi.Reference
	2, // 1: mojo.openapi.ReferenceableLink.link:type_name -> mojo.openapi.Link
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_mojo_openapi_referenceable_link_proto_init() }
func file_mojo_openapi_referenceable_link_proto_init() {
	if File_mojo_openapi_referenceable_link_proto != nil {
		return
	}
	file_mojo_openapi_link_proto_init()
	file_mojo_openapi_reference_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_mojo_openapi_referenceable_link_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ReferenceableLink); i {
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
	file_mojo_openapi_referenceable_link_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*ReferenceableLink_Reference)(nil),
		(*ReferenceableLink_Link)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_mojo_openapi_referenceable_link_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_openapi_referenceable_link_proto_goTypes,
		DependencyIndexes: file_mojo_openapi_referenceable_link_proto_depIdxs,
		MessageInfos:      file_mojo_openapi_referenceable_link_proto_msgTypes,
	}.Build()
	File_mojo_openapi_referenceable_link_proto = out.File
	file_mojo_openapi_referenceable_link_proto_rawDesc = nil
	file_mojo_openapi_referenceable_link_proto_goTypes = nil
	file_mojo_openapi_referenceable_link_proto_depIdxs = nil
}
