// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/example.proto

package org.mojolang.mojo.openapi;

public final class ExampleProto {
  private ExampleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_openapi_Example_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_openapi_Example_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032mojo/openapi/example.proto\022\014mojo.opena" +
      "pi\032\023mojo/core/any.proto\032\023mojo/core/url.p" +
      "roto\"v\n\007Example\022\017\n\007summary\030\001 \001(\t\022\023\n\013desc" +
      "ription\030\002 \001(\t\022\035\n\005value\030\003 \001(\0132\016.mojo.core" +
      ".Any\022&\n\016external_value\030\004 \001(\0132\016.mojo.core" +
      ".UrlBe\n\031org.mojolang.mojo.openapiB\014Examp" +
      "leProtoP\001Z8github.com/mojo-lang/openapi/" +
      "go/pkg/mojo/openapi;openapib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.core.AnyProto.getDescriptor(),
          org.mojolang.mojo.core.UrlProto.getDescriptor(),
        });
    internal_static_mojo_openapi_Example_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_openapi_Example_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_openapi_Example_descriptor,
        new java.lang.String[] { "Summary", "Description", "Value", "ExternalValue", });
    org.mojolang.mojo.core.AnyProto.getDescriptor();
    org.mojolang.mojo.core.UrlProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
