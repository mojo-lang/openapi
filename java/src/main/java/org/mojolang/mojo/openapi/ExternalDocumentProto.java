// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/external_document.proto

package org.mojolang.mojo.openapi;

public final class ExternalDocumentProto {
  private ExternalDocumentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_openapi_ExternalDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_openapi_ExternalDocument_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$mojo/openapi/external_document.proto\022\014" +
      "mojo.openapi\032\023mojo/core/url.proto\032\"mojo/" +
      "openapi/cached_document.proto\"b\n\020Externa" +
      "lDocument\0221\n\013description\030\001 \001(\0132\034.mojo.op" +
      "enapi.CachedDocument\022\033\n\003url\030\002 \001(\0132\016.mojo" +
      ".core.UrlBn\n\031org.mojolang.mojo.openapiB\025" +
      "ExternalDocumentProtoP\001Z8github.com/mojo" +
      "-lang/openapi/go/pkg/mojo/openapi;openap" +
      "ib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.core.UrlProto.getDescriptor(),
          org.mojolang.mojo.openapi.CachedDocumentProto.getDescriptor(),
        });
    internal_static_mojo_openapi_ExternalDocument_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_openapi_ExternalDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_openapi_ExternalDocument_descriptor,
        new java.lang.String[] { "Description", "Url", });
    org.mojolang.mojo.core.UrlProto.getDescriptor();
    org.mojolang.mojo.openapi.CachedDocumentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
