// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/server.proto

package org.mojolang.mojo.openapi;

public final class ServerProto {
  private ServerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_openapi_Server_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_openapi_Server_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_openapi_Server_VariablesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_openapi_Server_VariablesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031mojo/openapi/server.proto\022\014mojo.openap" +
      "i\032\023mojo/core/url.proto\032\"mojo/openapi/cac" +
      "hed_document.proto\032\"mojo/openapi/server_" +
      "variable.proto\"\340\001\n\006Server\022\033\n\003url\030\001 \001(\0132\016" +
      ".mojo.core.Url\0221\n\013description\030\003 \001(\0132\034.mo" +
      "jo.openapi.CachedDocument\0226\n\tvariables\030\004" +
      " \003(\0132#.mojo.openapi.Server.VariablesEntr" +
      "y\032N\n\016VariablesEntry\022\013\n\003key\030\001 \001(\t\022+\n\005valu" +
      "e\030\002 \001(\0132\034.mojo.openapi.ServerVariable:\0028" +
      "\001Bd\n\031org.mojolang.mojo.openapiB\013ServerPr" +
      "otoP\001Z8github.com/mojo-lang/openapi/go/p" +
      "kg/mojo/openapi;openapib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.core.UrlProto.getDescriptor(),
          org.mojolang.mojo.openapi.CachedDocumentProto.getDescriptor(),
          org.mojolang.mojo.openapi.ServerVariableProto.getDescriptor(),
        });
    internal_static_mojo_openapi_Server_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_openapi_Server_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_openapi_Server_descriptor,
        new java.lang.String[] { "Url", "Description", "Variables", });
    internal_static_mojo_openapi_Server_VariablesEntry_descriptor =
      internal_static_mojo_openapi_Server_descriptor.getNestedTypes().get(0);
    internal_static_mojo_openapi_Server_VariablesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_openapi_Server_VariablesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.mojolang.mojo.core.UrlProto.getDescriptor();
    org.mojolang.mojo.openapi.CachedDocumentProto.getDescriptor();
    org.mojolang.mojo.openapi.ServerVariableProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
