// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/cached_document.proto

package org.mojolang.mojo.openapi;

public final class CachedDocumentProto {
  private CachedDocumentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_openapi_CachedDocument_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_openapi_CachedDocument_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"mojo/openapi/cached_document.proto\022\014mo" +
      "jo.openapi\032\034mojo/document/document.proto" +
      "\"E\n\016CachedDocument\022\r\n\005cache\030\001 \001(\t\022$\n\003val" +
      "\030\002 \001(\0132\027.mojo.document.DocumentBl\n\031org.m" +
      "ojolang.mojo.openapiB\023CachedDocumentProt" +
      "oP\001Z8github.com/mojo-lang/openapi/go/pkg" +
      "/mojo/openapi;openapib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.document.DocumentProto.getDescriptor(),
        });
    internal_static_mojo_openapi_CachedDocument_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_openapi_CachedDocument_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_openapi_CachedDocument_descriptor,
        new java.lang.String[] { "Cache", "Val", });
    org.mojolang.mojo.document.DocumentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
