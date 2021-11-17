// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/security_scheme.proto

package org.mojolang.mojo.openapi;

public final class SecuritySchemeProto {
  private SecuritySchemeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_openapi_SecurityScheme_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_openapi_SecurityScheme_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"mojo/openapi/security_scheme.proto\022\014mo" +
      "jo.openapi\032\023mojo/core/url.proto\032\"mojo/op" +
      "enapi/cached_document.proto\032\036mojo/openap" +
      "i/oauth_flows.proto\"\365\002\n\016SecurityScheme\022/" +
      "\n\004type\030\001 \001(\0162!.mojo.openapi.SecuritySche" +
      "me.Type\0221\n\013description\030\002 \001(\0132\034.mojo.open" +
      "api.CachedDocument\022\014\n\004name\030\005 \001(\t\022\n\n\002in\030\006" +
      " \001(\t\022\016\n\006scheme\030\n \001(\t\022\025\n\rbearer_format\030\013 " +
      "\001(\t\022\'\n\005flows\030\017 \001(\0132\030.mojo.openapi.OAuthF" +
      "lows\022+\n\023open_id_connect_url\030\024 \001(\0132\016.mojo" +
      ".core.Url\"h\n\004Type\022\024\n\020TYPE_UNSPECIFIED\020\000\022" +
      "\020\n\014TYPE_API_KEY\020\001\022\r\n\tTYPE_HTTP\020\002\022\017\n\013TYPE" +
      "_OAUTH2\020\003\022\030\n\024TYPE_OPEN_ID_CONNECT\020\004Bl\n\031o" +
      "rg.mojolang.mojo.openapiB\023SecurityScheme" +
      "ProtoP\001Z8github.com/mojo-lang/openapi/go" +
      "/pkg/mojo/openapi;openapib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.core.UrlProto.getDescriptor(),
          org.mojolang.mojo.openapi.CachedDocumentProto.getDescriptor(),
          org.mojolang.mojo.openapi.OauthFlowsProto.getDescriptor(),
        });
    internal_static_mojo_openapi_SecurityScheme_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_openapi_SecurityScheme_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_openapi_SecurityScheme_descriptor,
        new java.lang.String[] { "Type", "Description", "Name", "In", "Scheme", "BearerFormat", "Flows", "OpenIdConnectUrl", });
    org.mojolang.mojo.core.UrlProto.getDescriptor();
    org.mojolang.mojo.openapi.CachedDocumentProto.getDescriptor();
    org.mojolang.mojo.openapi.OauthFlowsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
