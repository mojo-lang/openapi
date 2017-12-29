// Code generated by protoc-gen-gogo. DO NOT EDIT.
// source: mojo/openapi/info.proto

package openapi

import (
	fmt "fmt"
	proto "github.com/gogo/protobuf/proto"
	core "github.com/mojo-lang/core/go/pkg/mojo/core"
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

type Info struct {
	Title                string          `protobuf:"bytes,1,opt,name=title,proto3" json:"title,omitempty"`
	Description          *CachedDocument `protobuf:"bytes,2,opt,name=description,proto3" json:"description,omitempty"`
	TermsOfService       *core.Url       `protobuf:"bytes,3,opt,name=terms_of_service,json=termsOfService,proto3" json:"termsOfService,omitempty"`
	Contact              *Contact        `protobuf:"bytes,4,opt,name=contact,proto3" json:"contact,omitempty"`
	License              *License        `protobuf:"bytes,5,opt,name=license,proto3" json:"license,omitempty"`
	Version              *core.Version   `protobuf:"bytes,6,opt,name=version,proto3" json:"version,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *Info) Reset()         { *m = Info{} }
func (m *Info) String() string { return proto.CompactTextString(m) }
func (*Info) ProtoMessage()    {}
func (*Info) Descriptor() ([]byte, []int) {
	return fileDescriptor_fc1965bf0c32c527, []int{0}
}
func (m *Info) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Info.Unmarshal(m, b)
}
func (m *Info) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Info.Marshal(b, m, deterministic)
}
func (m *Info) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Info.Merge(m, src)
}
func (m *Info) XXX_Size() int {
	return xxx_messageInfo_Info.Size(m)
}
func (m *Info) XXX_DiscardUnknown() {
	xxx_messageInfo_Info.DiscardUnknown(m)
}

var xxx_messageInfo_Info proto.InternalMessageInfo

func (m *Info) GetTitle() string {
	if m != nil {
		return m.Title
	}
	return ""
}

func (m *Info) GetDescription() *CachedDocument {
	if m != nil {
		return m.Description
	}
	return nil
}

func (m *Info) GetTermsOfService() *core.Url {
	if m != nil {
		return m.TermsOfService
	}
	return nil
}

func (m *Info) GetContact() *Contact {
	if m != nil {
		return m.Contact
	}
	return nil
}

func (m *Info) GetLicense() *License {
	if m != nil {
		return m.License
	}
	return nil
}

func (m *Info) GetVersion() *core.Version {
	if m != nil {
		return m.Version
	}
	return nil
}

func init() {
	proto.RegisterType((*Info)(nil), "mojo.openapi.Info")
}

func init() { proto.RegisterFile("mojo/openapi/info.proto", fileDescriptor_fc1965bf0c32c527) }

var fileDescriptor_fc1965bf0c32c527 = []byte{
	// 382 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x6c, 0x92, 0xdf, 0x6a, 0xe2, 0x40,
	0x14, 0x87, 0xc9, 0xfa, 0x0f, 0xc7, 0xc5, 0xdd, 0x8d, 0x88, 0x51, 0x84, 0x88, 0x57, 0x2e, 0xec,
	0x26, 0xb0, 0x7b, 0x53, 0xe8, 0x5d, 0x2c, 0x85, 0x42, 0xa1, 0xd2, 0x52, 0xa1, 0xbd, 0x91, 0x38,
	0x4e, 0xe2, 0xb4, 0xc9, 0x9c, 0x30, 0x19, 0x85, 0x3e, 0x5a, 0x5f, 0x26, 0x0f, 0x90, 0xa7, 0x28,
	0x99, 0x99, 0xb6, 0x93, 0xe2, 0x55, 0xe0, 0xfc, 0xbe, 0xf9, 0x38, 0x39, 0xe7, 0xa0, 0x51, 0x0a,
	0x4f, 0xe0, 0x43, 0x46, 0x58, 0x98, 0x51, 0x9f, 0xb2, 0x08, 0xbc, 0x8c, 0x83, 0x00, 0xfb, 0x7b,
	0x15, 0x78, 0x3a, 0x98, 0x0c, 0x24, 0x86, 0x81, 0x13, 0xff, 0xc0, 0x13, 0x85, 0x4c, 0x46, 0x9f,
	0xc5, 0x23, 0xe1, 0x39, 0x05, 0xa6, 0x83, 0x79, 0x4d, 0x8a, 0x43, 0xbc, 0x27, 0xbb, 0xcd, 0x0e,
	0xf0, 0x21, 0x25, 0x4c, 0x68, 0x66, 0x52, 0x67, 0x80, 0x89, 0x10, 0x9f, 0xce, 0x12, 0x8a, 0x09,
	0xcb, 0x89, 0xca, 0xe6, 0xaf, 0x0d, 0xd4, 0xbc, 0x62, 0x11, 0xd8, 0xbf, 0x51, 0x4b, 0x50, 0x91,
	0x10, 0xc7, 0x9a, 0x59, 0x8b, 0x6e, 0x30, 0x28, 0x0b, 0xf7, 0x87, 0x2c, 0xfc, 0x81, 0x94, 0x0a,
	0x92, 0x66, 0xe2, 0xe5, 0x56, 0x11, 0xf6, 0x03, 0xea, 0xed, 0x48, 0x8e, 0x39, 0xcd, 0x04, 0x05,
	0xe6, 0x7c, 0x9b, 0x59, 0x8b, 0xde, 0xbf, 0xa9, 0x67, 0xfe, 0xa1, 0xb7, 0x94, 0x5d, 0x5e, 0xe8,
	0x26, 0x83, 0x71, 0x59, 0xb8, 0x43, 0xe3, 0x91, 0x21, 0x35, 0x5d, 0xf6, 0x1a, 0xfd, 0x14, 0x84,
	0xa7, 0xf9, 0x06, 0xa2, 0x4d, 0x4e, 0xf8, 0x91, 0x62, 0xe2, 0x34, 0xa4, 0xbf, 0xaf, 0xfc, 0xd5,
	0x78, 0xbc, 0x7b, 0x9e, 0x04, 0xd3, 0xb2, 0x70, 0x1d, 0xc9, 0xde, 0x44, 0x77, 0x8a, 0x34, 0xa4,
	0xfd, 0x7a, 0x62, 0x5f, 0xa2, 0x8e, 0x9e, 0x89, 0xd3, 0x94, 0xba, 0xe1, 0x97, 0x76, 0x55, 0x18,
	0x0c, 0xcb, 0xc2, 0xfd, 0xa5, 0x49, 0x43, 0xf7, 0xfe, 0xb8, 0xf2, 0xe8, 0xf9, 0x39, 0xad, 0x53,
	0x9e, 0x6b, 0x15, 0x2a, 0x8f, 0x26, 0x4d, 0x8f, 0x2e, 0xd9, 0x4b, 0xd4, 0xd1, 0x3b, 0x76, 0xda,
	0xd2, 0x63, 0x1b, 0xbf, 0xb7, 0x56, 0x89, 0x92, 0x68, 0xcc, 0x94, 0xe8, 0x52, 0xb0, 0x45, 0x63,
	0xe0, 0xb1, 0x7c, 0x98, 0x84, 0x2c, 0xae, 0x75, 0x12, 0x74, 0xab, 0xad, 0xae, 0xaa, 0x1d, 0xaf,
	0xac, 0xc7, 0xb3, 0x98, 0x8a, 0xfd, 0x61, 0xeb, 0x61, 0x48, 0xfd, 0x8a, 0xfa, 0x5b, 0xf1, 0x1f,
	0x17, 0x11, 0x83, 0x9f, 0x3d, 0xc7, 0xbe, 0x79, 0x25, 0xe7, 0xfa, 0xbb, 0x6d, 0xcb, 0x33, 0xf9,
	0xff, 0x16, 0x00, 0x00, 0xff, 0xff, 0xf1, 0xd4, 0xd7, 0x9e, 0xd9, 0x02, 0x00, 0x00,
}
