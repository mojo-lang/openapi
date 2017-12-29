// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: mojo/openapi/server_variable.proto

package openapi

import (
	fmt "fmt"
	proto "github.com/gogo/protobuf/proto"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.GoGoProtoPackageIsVersion3 // please upgrade the proto package

type ServerVariable struct {
	Enum                 []string        `protobuf:"bytes,1,rep,name=enum,proto3" json:"enum,omitempty"`
	Default              string          `protobuf:"bytes,2,opt,name=default,proto3" json:"default,omitempty"`
	Description          *CachedDocument `protobuf:"bytes,4,opt,name=description,proto3" json:"description,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *ServerVariable) Reset()         { *m = ServerVariable{} }
func (m *ServerVariable) String() string { return proto.CompactTextString(m) }
func (*ServerVariable) ProtoMessage()    {}
func (*ServerVariable) Descriptor() ([]byte, []int) {
	return fileDescriptor_57c6f4f8f580c08b, []int{0}
}
func (m *ServerVariable) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_ServerVariable.Unmarshal(m, b)
}
func (m *ServerVariable) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_ServerVariable.Marshal(b, m, deterministic)
}
func (m *ServerVariable) XXX_Merge(src proto.Message) {
	xxx_messageInfo_ServerVariable.Merge(m, src)
}
func (m *ServerVariable) XXX_Size() int {
	return xxx_messageInfo_ServerVariable.Size(m)
}
func (m *ServerVariable) XXX_DiscardUnknown() {
	xxx_messageInfo_ServerVariable.DiscardUnknown(m)
}

var xxx_messageInfo_ServerVariable proto.InternalMessageInfo

func (m *ServerVariable) GetEnum() []string {
	if m != nil {
		return m.Enum
	}
	return nil
}

func (m *ServerVariable) GetDefault() string {
	if m != nil {
		return m.Default
	}
	return ""
}

func (m *ServerVariable) GetDescription() *CachedDocument {
	if m != nil {
		return m.Description
	}
	return nil
}

func init() {
	proto.RegisterType((*ServerVariable)(nil), "mojo.openapi.ServerVariable")
}

func init() {
	proto.RegisterFile("mojo/openapi/server_variable.proto", fileDescriptor_57c6f4f8f580c08b)
}

var fileDescriptor_57c6f4f8f580c08b = []byte{
	// 271 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x54, 0x90, 0xd1, 0x4a, 0xc3, 0x30,
	0x14, 0x86, 0xa9, 0x0e, 0x65, 0x99, 0x0c, 0xac, 0x0c, 0x3a, 0x11, 0x5a, 0x76, 0x21, 0xbd, 0xd0,
	0x06, 0xf4, 0x46, 0xf0, 0xae, 0xfa, 0x00, 0x43, 0x41, 0xd0, 0x9b, 0x91, 0xb6, 0xc7, 0x2e, 0xda,
	0xf4, 0x84, 0x2c, 0x1d, 0xf8, 0x7e, 0x3e, 0x47, 0x1f, 0xa0, 0x4f, 0x21, 0x89, 0x51, 0xd2, 0xab,
	0x90, 0xe4, 0xfb, 0x3f, 0xce, 0xf9, 0xc9, 0x4a, 0xe0, 0x07, 0x52, 0x94, 0xd0, 0x32, 0xc9, 0xe9,
	0x0e, 0xd4, 0x1e, 0xd4, 0x66, 0xcf, 0x14, 0x67, 0x45, 0x03, 0x99, 0x54, 0xa8, 0x31, 0x3c, 0x31,
	0x4c, 0xe6, 0x98, 0xf3, 0x71, 0xa2, 0x64, 0xe5, 0x16, 0xaa, 0x4d, 0x85, 0x65, 0x27, 0xa0, 0xd5,
	0xbf, 0x89, 0xd5, 0x77, 0x40, 0xe6, 0xcf, 0xd6, 0xf5, 0xe2, 0x54, 0xe1, 0x25, 0x99, 0x40, 0xdb,
	0x89, 0x28, 0x48, 0x0e, 0xd3, 0x69, 0x1e, 0x0e, 0x7d, 0x3c, 0x37, 0xf7, 0x2b, 0x14, 0x5c, 0x83,
	0x90, 0xfa, 0xeb, 0xc9, 0xfe, 0x87, 0x94, 0x1c, 0x57, 0xf0, 0xce, 0xba, 0x46, 0x47, 0x07, 0x49,
	0x90, 0x4e, 0xf3, 0xc5, 0xd0, 0xc7, 0xa7, 0xee, 0xc9, 0xa3, 0xff, 0xa8, 0xf0, 0x95, 0xcc, 0x2a,
	0xd8, 0x95, 0x8a, 0x4b, 0xcd, 0xb1, 0x8d, 0x26, 0x49, 0x90, 0xce, 0x6e, 0x2e, 0x32, 0x7f, 0xe6,
	0xec, 0xc1, 0x4e, 0xf9, 0xe8, 0x86, 0xcc, 0x97, 0x43, 0x1f, 0x2f, 0xbc, 0x90, 0xa7, 0xf5, 0x5d,
	0x79, 0x43, 0x96, 0xa8, 0x6a, 0xab, 0x6a, 0x58, 0x5b, 0x8f, 0x9c, 0xf9, 0xd9, 0x78, 0xc1, 0xb5,
	0x59, 0x7c, 0x1d, 0xbc, 0xdd, 0xd5, 0x5c, 0x6f, 0xbb, 0x22, 0x2b, 0x51, 0x50, 0xc3, 0x5f, 0x9b,
	0xe4, 0x7f, 0x5d, 0x35, 0x52, 0xf9, 0x59, 0x53, 0xbf, 0xc2, 0x7b, 0x77, 0x16, 0x47, 0xb6, 0xbb,
	0xdb, 0x9f, 0x00, 0x00, 0x00, 0xff, 0xff, 0x51, 0x80, 0x85, 0xa3, 0x93, 0x01, 0x00, 0x00,
}
