// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: mojo/openapi/server_variable.proto

package openapi

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
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
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

type ServerVariable struct {
	Enum                 []string        `protobuf:"bytes,1,rep,name=enum,proto3" json:"enum,omitempty"`
	Default              string          `protobuf:"bytes,2,opt,name=default,proto3" json:"default,omitempty"`
	Description          *CachedDocument `protobuf:"bytes,4,opt,name=description,proto3" json:"description,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-" gorm:"-" xml:"-" bson:"-"`
	XXX_unrecognized     []byte          `json:"-" gorm:"-" xml:"-" bson:"-"`
	XXX_sizecache        int32           `json:"-" gorm:"-" xml:"-" bson:"-"`
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
	// 277 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x52, 0xca, 0xcd, 0xcf, 0xca,
	0xd7, 0xcf, 0x2f, 0x48, 0xcd, 0x4b, 0x2c, 0xc8, 0xd4, 0x2f, 0x4e, 0x2d, 0x2a, 0x4b, 0x2d, 0x8a,
	0x2f, 0x4b, 0x2c, 0xca, 0x4c, 0x4c, 0xca, 0x49, 0xd5, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0xe2,
	0x01, 0xa9, 0xd1, 0x83, 0xaa, 0x91, 0x42, 0xd5, 0x91, 0x9c, 0x98, 0x9c, 0x91, 0x9a, 0x12, 0x9f,
	0x92, 0x9f, 0x5c, 0x9a, 0x9b, 0x9a, 0x57, 0x02, 0xd1, 0xa1, 0x74, 0x84, 0x91, 0x8b, 0x2f, 0x18,
	0x6c, 0x56, 0x18, 0xd4, 0x28, 0x21, 0x35, 0x2e, 0x96, 0xd4, 0xbc, 0xd2, 0x5c, 0x09, 0x46, 0x05,
	0x66, 0x0d, 0x4e, 0x27, 0xa1, 0x57, 0xf7, 0xe4, 0xf9, 0x40, 0x7c, 0x9d, 0xfc, 0xdc, 0xcc, 0x92,
	0xd4, 0xdc, 0x82, 0x92, 0xca, 0x20, 0xb0, 0xbc, 0x90, 0x3e, 0x17, 0x7b, 0x4a, 0x6a, 0x5a, 0x62,
	0x69, 0x4e, 0x89, 0x04, 0x93, 0x02, 0xa3, 0x06, 0xa7, 0x93, 0xe8, 0xab, 0x7b, 0xf2, 0x82, 0x50,
	0x21, 0x24, 0xd5, 0x30, 0x55, 0x42, 0x91, 0x5c, 0xdc, 0x29, 0xa9, 0xc5, 0xc9, 0x45, 0x99, 0x05,
	0x25, 0x99, 0xf9, 0x79, 0x12, 0x2c, 0x0a, 0x8c, 0x1a, 0xdc, 0x46, 0x32, 0x7a, 0xc8, 0x6e, 0xd6,
	0x73, 0x06, 0xbb, 0xd2, 0x05, 0xea, 0x48, 0x27, 0xc9, 0x57, 0xf7, 0xe4, 0x45, 0x91, 0x34, 0x21,
	0x19, 0x8b, 0x6c, 0x96, 0x53, 0xc1, 0x8c, 0xc7, 0x72, 0x0c, 0x5c, 0x92, 0xf9, 0x45, 0xe9, 0x60,
	0xe3, 0x72, 0x12, 0xf3, 0xd2, 0x51, 0xcc, 0x75, 0x12, 0x46, 0xf5, 0x64, 0x00, 0xc8, 0xf3, 0x01,
	0x8c, 0x51, 0x16, 0xe9, 0x99, 0x25, 0x19, 0xa5, 0x49, 0x7a, 0xc9, 0xf9, 0xb9, 0xfa, 0x20, 0xf5,
	0xba, 0x20, 0x9d, 0xf0, 0x20, 0x4b, 0xcf, 0xd7, 0x2f, 0xc8, 0x4e, 0xd7, 0x47, 0x0e, 0x46, 0x6b,
	0x28, 0x9d, 0xc4, 0x06, 0x0e, 0x3f, 0x63, 0x40, 0x00, 0x00, 0x00, 0xff, 0xff, 0xa7, 0x90, 0xec,
	0x8d, 0x97, 0x01, 0x00, 0x00,
}
