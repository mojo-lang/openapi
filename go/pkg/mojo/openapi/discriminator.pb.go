// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/openapi/discriminator.proto

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

type Discriminator struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	PropertyName string            `protobuf:"bytes,1,opt,name=property_name,json=propertyName,proto3" json:"propertyName,omitempty"`
	Mapping      map[string]string `protobuf:"bytes,2,rep,name=mapping,proto3" json:"mapping,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
}

func (x *Discriminator) Reset() {
	*x = Discriminator{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_openapi_discriminator_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Discriminator) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Discriminator) ProtoMessage() {}

func (x *Discriminator) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_openapi_discriminator_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Discriminator.ProtoReflect.Descriptor instead.
func (*Discriminator) Descriptor() ([]byte, []int) {
	return file_mojo_openapi_discriminator_proto_rawDescGZIP(), []int{0}
}

func (x *Discriminator) GetPropertyName() string {
	if x != nil {
		return x.PropertyName
	}
	return ""
}

func (x *Discriminator) GetMapping() map[string]string {
	if x != nil {
		return x.Mapping
	}
	return nil
}

var File_mojo_openapi_discriminator_proto protoreflect.FileDescriptor

var file_mojo_openapi_discriminator_proto_rawDesc = []byte{
	0x0a, 0x20, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2f, 0x64,
	0x69, 0x73, 0x63, 0x72, 0x69, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x0c, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69,
	0x22, 0xb4, 0x01, 0x0a, 0x0d, 0x44, 0x69, 0x73, 0x63, 0x72, 0x69, 0x6d, 0x69, 0x6e, 0x61, 0x74,
	0x6f, 0x72, 0x12, 0x23, 0x0a, 0x0d, 0x70, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x79, 0x5f, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x70, 0x72, 0x6f, 0x70, 0x65,
	0x72, 0x74, 0x79, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x42, 0x0a, 0x07, 0x6d, 0x61, 0x70, 0x70, 0x69,
	0x6e, 0x67, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x28, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e,
	0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2e, 0x44, 0x69, 0x73, 0x63, 0x72, 0x69, 0x6d, 0x69,
	0x6e, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x4d, 0x61, 0x70, 0x70, 0x69, 0x6e, 0x67, 0x45, 0x6e, 0x74,
	0x72, 0x79, 0x52, 0x07, 0x6d, 0x61, 0x70, 0x70, 0x69, 0x6e, 0x67, 0x1a, 0x3a, 0x0a, 0x0c, 0x4d,
	0x61, 0x70, 0x70, 0x69, 0x6e, 0x67, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03, 0x6b,
	0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x14, 0x0a,
	0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x76, 0x61,
	0x6c, 0x75, 0x65, 0x3a, 0x02, 0x38, 0x01, 0x42, 0x6b, 0x0a, 0x19, 0x6f, 0x72, 0x67, 0x2e, 0x6d,
	0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6f, 0x70, 0x65,
	0x6e, 0x61, 0x70, 0x69, 0x42, 0x12, 0x44, 0x69, 0x73, 0x63, 0x72, 0x69, 0x6d, 0x69, 0x6e, 0x61,
	0x74, 0x6f, 0x72, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x38, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67,
	0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x3b, 0x6f, 0x70, 0x65,
	0x6e, 0x61, 0x70, 0x69, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_openapi_discriminator_proto_rawDescOnce sync.Once
	file_mojo_openapi_discriminator_proto_rawDescData = file_mojo_openapi_discriminator_proto_rawDesc
)

func file_mojo_openapi_discriminator_proto_rawDescGZIP() []byte {
	file_mojo_openapi_discriminator_proto_rawDescOnce.Do(func() {
		file_mojo_openapi_discriminator_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_openapi_discriminator_proto_rawDescData)
	})
	return file_mojo_openapi_discriminator_proto_rawDescData
}

var file_mojo_openapi_discriminator_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_mojo_openapi_discriminator_proto_goTypes = []interface{}{
	(*Discriminator)(nil), // 0: mojo.openapi.Discriminator
	nil,                   // 1: mojo.openapi.Discriminator.MappingEntry
}
var file_mojo_openapi_discriminator_proto_depIdxs = []int32{
	1, // 0: mojo.openapi.Discriminator.mapping:type_name -> mojo.openapi.Discriminator.MappingEntry
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_mojo_openapi_discriminator_proto_init() }
func file_mojo_openapi_discriminator_proto_init() {
	if File_mojo_openapi_discriminator_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_mojo_openapi_discriminator_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Discriminator); i {
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
			RawDescriptor: file_mojo_openapi_discriminator_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_openapi_discriminator_proto_goTypes,
		DependencyIndexes: file_mojo_openapi_discriminator_proto_depIdxs,
		MessageInfos:      file_mojo_openapi_discriminator_proto_msgTypes,
	}.Build()
	File_mojo_openapi_discriminator_proto = out.File
	file_mojo_openapi_discriminator_proto_rawDesc = nil
	file_mojo_openapi_discriminator_proto_goTypes = nil
	file_mojo_openapi_discriminator_proto_depIdxs = nil
}
