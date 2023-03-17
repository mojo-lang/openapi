// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/openapi/xml.proto

package openapi

import (
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

type Xml struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name      string    `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Namespace *core.Url `protobuf:"bytes,2,opt,name=namespace,proto3" json:"namespace,omitempty"`
	Prefix    string    `protobuf:"bytes,3,opt,name=prefix,proto3" json:"prefix,omitempty"`
	Attribute bool      `protobuf:"varint,10,opt,name=attribute,proto3" json:"attribute,omitempty"`
	Wrapped   bool      `protobuf:"varint,11,opt,name=wrapped,proto3" json:"wrapped,omitempty"`
}

func (x *Xml) Reset() {
	*x = Xml{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_openapi_xml_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Xml) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Xml) ProtoMessage() {}

func (x *Xml) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_openapi_xml_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Xml.ProtoReflect.Descriptor instead.
func (*Xml) Descriptor() ([]byte, []int) {
	return file_mojo_openapi_xml_proto_rawDescGZIP(), []int{0}
}

func (x *Xml) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Xml) GetNamespace() *core.Url {
	if x != nil {
		return x.Namespace
	}
	return nil
}

func (x *Xml) GetPrefix() string {
	if x != nil {
		return x.Prefix
	}
	return ""
}

func (x *Xml) GetAttribute() bool {
	if x != nil {
		return x.Attribute
	}
	return false
}

func (x *Xml) GetWrapped() bool {
	if x != nil {
		return x.Wrapped
	}
	return false
}

var File_mojo_openapi_xml_proto protoreflect.FileDescriptor

var file_mojo_openapi_xml_proto_rawDesc = []byte{
	0x0a, 0x16, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2f, 0x78,
	0x6d, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6f,
	0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x1a, 0x13, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x63, 0x6f, 0x72,
	0x65, 0x2f, 0x75, 0x72, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x97, 0x01, 0x0a, 0x03,
	0x58, 0x6d, 0x6c, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x2c, 0x0a, 0x09, 0x6e, 0x61, 0x6d, 0x65, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x6d, 0x6f, 0x6a,
	0x6f, 0x2e, 0x63, 0x6f, 0x72, 0x65, 0x2e, 0x55, 0x72, 0x6c, 0x52, 0x09, 0x6e, 0x61, 0x6d, 0x65,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x70, 0x72, 0x65, 0x66, 0x69, 0x78, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x70, 0x72, 0x65, 0x66, 0x69, 0x78, 0x12, 0x1c, 0x0a,
	0x09, 0x61, 0x74, 0x74, 0x72, 0x69, 0x62, 0x75, 0x74, 0x65, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x08,
	0x52, 0x09, 0x61, 0x74, 0x74, 0x72, 0x69, 0x62, 0x75, 0x74, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x77,
	0x72, 0x61, 0x70, 0x70, 0x65, 0x64, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x77, 0x72,
	0x61, 0x70, 0x70, 0x65, 0x64, 0x42, 0x61, 0x0a, 0x19, 0x6f, 0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a,
	0x6f, 0x6c, 0x61, 0x6e, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61,
	0x70, 0x69, 0x42, 0x08, 0x58, 0x6d, 0x6c, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x38,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d,
	0x6c, 0x61, 0x6e, 0x67, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2f, 0x67, 0x6f, 0x2f,
	0x70, 0x6b, 0x67, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69,
	0x3b, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_openapi_xml_proto_rawDescOnce sync.Once
	file_mojo_openapi_xml_proto_rawDescData = file_mojo_openapi_xml_proto_rawDesc
)

func file_mojo_openapi_xml_proto_rawDescGZIP() []byte {
	file_mojo_openapi_xml_proto_rawDescOnce.Do(func() {
		file_mojo_openapi_xml_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_openapi_xml_proto_rawDescData)
	})
	return file_mojo_openapi_xml_proto_rawDescData
}

var file_mojo_openapi_xml_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_mojo_openapi_xml_proto_goTypes = []interface{}{
	(*Xml)(nil),      // 0: mojo.openapi.Xml
	(*core.Url)(nil), // 1: mojo.core.Url
}
var file_mojo_openapi_xml_proto_depIdxs = []int32{
	1, // 0: mojo.openapi.Xml.namespace:type_name -> mojo.core.Url
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_mojo_openapi_xml_proto_init() }
func file_mojo_openapi_xml_proto_init() {
	if File_mojo_openapi_xml_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_mojo_openapi_xml_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Xml); i {
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
			RawDescriptor: file_mojo_openapi_xml_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_openapi_xml_proto_goTypes,
		DependencyIndexes: file_mojo_openapi_xml_proto_depIdxs,
		MessageInfos:      file_mojo_openapi_xml_proto_msgTypes,
	}.Build()
	File_mojo_openapi_xml_proto = out.File
	file_mojo_openapi_xml_proto_rawDesc = nil
	file_mojo_openapi_xml_proto_goTypes = nil
	file_mojo_openapi_xml_proto_depIdxs = nil
}
