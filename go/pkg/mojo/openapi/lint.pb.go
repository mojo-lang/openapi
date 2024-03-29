// Code generated by mojo. DO NOT EDIT.

// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.0
// 	protoc        v3.21.12
// source: mojo/openapi/lint.proto

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

type LintResult struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Valid      bool             `protobuf:"varint,1,opt,name=valid,proto3" json:"valid,omitempty"`
	Operations []*LintOperation `protobuf:"bytes,2,rep,name=operations,proto3" json:"operations,omitempty"`
}

func (x *LintResult) Reset() {
	*x = LintResult{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_openapi_lint_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LintResult) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LintResult) ProtoMessage() {}

func (x *LintResult) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_openapi_lint_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LintResult.ProtoReflect.Descriptor instead.
func (*LintResult) Descriptor() ([]byte, []int) {
	return file_mojo_openapi_lint_proto_rawDescGZIP(), []int{0}
}

func (x *LintResult) GetValid() bool {
	if x != nil {
		return x.Valid
	}
	return false
}

func (x *LintResult) GetOperations() []*LintOperation {
	if x != nil {
		return x.Operations
	}
	return nil
}

type LintOperation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Path        string `protobuf:"bytes,1,opt,name=path,proto3" json:"path,omitempty"`
	Method      string `protobuf:"bytes,2,opt,name=method,proto3" json:"method,omitempty"`
	Valid       bool   `protobuf:"varint,3,opt,name=valid,proto3" json:"valid,omitempty"`
	Description string `protobuf:"bytes,4,opt,name=description,proto3" json:"description,omitempty"`
	HowToFix    string `protobuf:"bytes,5,opt,name=how_to_fix,json=howToFix,proto3" json:"howToFix,omitempty"`
	Line        int32  `protobuf:"varint,6,opt,name=line,proto3" json:"line,omitempty"`
}

func (x *LintOperation) Reset() {
	*x = LintOperation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_mojo_openapi_lint_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LintOperation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LintOperation) ProtoMessage() {}

func (x *LintOperation) ProtoReflect() protoreflect.Message {
	mi := &file_mojo_openapi_lint_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LintOperation.ProtoReflect.Descriptor instead.
func (*LintOperation) Descriptor() ([]byte, []int) {
	return file_mojo_openapi_lint_proto_rawDescGZIP(), []int{1}
}

func (x *LintOperation) GetPath() string {
	if x != nil {
		return x.Path
	}
	return ""
}

func (x *LintOperation) GetMethod() string {
	if x != nil {
		return x.Method
	}
	return ""
}

func (x *LintOperation) GetValid() bool {
	if x != nil {
		return x.Valid
	}
	return false
}

func (x *LintOperation) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

func (x *LintOperation) GetHowToFix() string {
	if x != nil {
		return x.HowToFix
	}
	return ""
}

func (x *LintOperation) GetLine() int32 {
	if x != nil {
		return x.Line
	}
	return 0
}

var File_mojo_openapi_lint_proto protoreflect.FileDescriptor

var file_mojo_openapi_lint_proto_rawDesc = []byte{
	0x0a, 0x17, 0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2f, 0x6c,
	0x69, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e,
	0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x22, 0x5f, 0x0a, 0x0a, 0x4c, 0x69, 0x6e, 0x74, 0x52,
	0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x08, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x12, 0x3b, 0x0a, 0x0a, 0x6f,
	0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x1b, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2e, 0x4c,
	0x69, 0x6e, 0x74, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0a, 0x6f, 0x70,
	0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x22, 0xa5, 0x01, 0x0a, 0x0d, 0x4c, 0x69, 0x6e,
	0x74, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x12, 0x0a, 0x04, 0x70, 0x61,
	0x74, 0x68, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x70, 0x61, 0x74, 0x68, 0x12, 0x16,
	0x0a, 0x06, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06,
	0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x12, 0x14, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x12, 0x20, 0x0a, 0x0b,
	0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x04, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0b, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x1c,
	0x0a, 0x0a, 0x68, 0x6f, 0x77, 0x5f, 0x74, 0x6f, 0x5f, 0x66, 0x69, 0x78, 0x18, 0x05, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x08, 0x68, 0x6f, 0x77, 0x54, 0x6f, 0x46, 0x69, 0x78, 0x12, 0x12, 0x0a, 0x04,
	0x6c, 0x69, 0x6e, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x05, 0x52, 0x04, 0x6c, 0x69, 0x6e, 0x65,
	0x42, 0x62, 0x0a, 0x19, 0x6f, 0x72, 0x67, 0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x6c, 0x61, 0x6e, 0x67,
	0x2e, 0x6d, 0x6f, 0x6a, 0x6f, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x42, 0x09, 0x4c,
	0x69, 0x6e, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x38, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x6f, 0x6a, 0x6f, 0x2d, 0x6c, 0x61, 0x6e, 0x67,
	0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x2f, 0x67, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f,
	0x6d, 0x6f, 0x6a, 0x6f, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x70, 0x69, 0x3b, 0x6f, 0x70, 0x65,
	0x6e, 0x61, 0x70, 0x69, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_mojo_openapi_lint_proto_rawDescOnce sync.Once
	file_mojo_openapi_lint_proto_rawDescData = file_mojo_openapi_lint_proto_rawDesc
)

func file_mojo_openapi_lint_proto_rawDescGZIP() []byte {
	file_mojo_openapi_lint_proto_rawDescOnce.Do(func() {
		file_mojo_openapi_lint_proto_rawDescData = protoimpl.X.CompressGZIP(file_mojo_openapi_lint_proto_rawDescData)
	})
	return file_mojo_openapi_lint_proto_rawDescData
}

var file_mojo_openapi_lint_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_mojo_openapi_lint_proto_goTypes = []interface{}{
	(*LintResult)(nil),    // 0: mojo.openapi.LintResult
	(*LintOperation)(nil), // 1: mojo.openapi.LintOperation
}
var file_mojo_openapi_lint_proto_depIdxs = []int32{
	1, // 0: mojo.openapi.LintResult.operations:type_name -> mojo.openapi.LintOperation
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_mojo_openapi_lint_proto_init() }
func file_mojo_openapi_lint_proto_init() {
	if File_mojo_openapi_lint_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_mojo_openapi_lint_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LintResult); i {
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
		file_mojo_openapi_lint_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LintOperation); i {
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
			RawDescriptor: file_mojo_openapi_lint_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_mojo_openapi_lint_proto_goTypes,
		DependencyIndexes: file_mojo_openapi_lint_proto_depIdxs,
		MessageInfos:      file_mojo_openapi_lint_proto_msgTypes,
	}.Build()
	File_mojo_openapi_lint_proto = out.File
	file_mojo_openapi_lint_proto_rawDesc = nil
	file_mojo_openapi_lint_proto_goTypes = nil
	file_mojo_openapi_lint_proto_depIdxs = nil
}
