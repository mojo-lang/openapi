// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/referenceable_example.proto

package org.mojolang.mojo.openapi;

public final class ReferenceableExampleProto {
  private ReferenceableExampleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_openapi_ReferenceableExample_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_openapi_ReferenceableExample_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(mojo/openapi/referenceable_example.pro" +
      "to\022\014mojo.openapi\032\032mojo/openapi/example.p" +
      "roto\032\034mojo/openapi/reference.proto\"\207\001\n\024R" +
      "eferenceableExample\022,\n\treference\030\001 \001(\0132\027" +
      ".mojo.openapi.ReferenceH\000\022(\n\007example\030\002 \001" +
      "(\0132\025.mojo.openapi.ExampleH\000B\027\n\025reference" +
      "able_exampleBr\n\031org.mojolang.mojo.openap" +
      "iB\031ReferenceableExampleProtoP\001Z8github.c" +
      "om/mojo-lang/openapi/go/pkg/mojo/openapi" +
      ";openapib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.openapi.ExampleProto.getDescriptor(),
          org.mojolang.mojo.openapi.ReferenceProto.getDescriptor(),
        });
    internal_static_mojo_openapi_ReferenceableExample_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_openapi_ReferenceableExample_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_openapi_ReferenceableExample_descriptor,
        new java.lang.String[] { "Reference", "Example", "ReferenceableExample", });
    org.mojolang.mojo.openapi.ExampleProto.getDescriptor();
    org.mojolang.mojo.openapi.ReferenceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
