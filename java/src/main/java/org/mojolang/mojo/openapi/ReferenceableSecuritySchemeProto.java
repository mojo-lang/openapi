// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/referenceable_security_scheme.proto

package org.mojolang.mojo.openapi;

public final class ReferenceableSecuritySchemeProto {
  private ReferenceableSecuritySchemeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_openapi_ReferenceableSecurityScheme_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_openapi_ReferenceableSecurityScheme_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0mojo/openapi/referenceable_security_sc" +
      "heme.proto\022\014mojo.openapi\032\034mojo/openapi/r" +
      "eference.proto\032\"mojo/openapi/security_sc" +
      "heme.proto\"\245\001\n\033ReferenceableSecuritySche" +
      "me\022,\n\treference\030\001 \001(\0132\027.mojo.openapi.Ref" +
      "erenceH\000\0227\n\017security_scheme\030\002 \001(\0132\034.mojo" +
      ".openapi.SecuritySchemeH\000B\037\n\035referenceab" +
      "le_security_schemeBy\n\031org.mojolang.mojo." +
      "openapiB ReferenceableSecuritySchemeProt" +
      "oP\001Z8github.com/mojo-lang/openapi/go/pkg" +
      "/mojo/openapi;openapib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.openapi.ReferenceProto.getDescriptor(),
          org.mojolang.mojo.openapi.SecuritySchemeProto.getDescriptor(),
        });
    internal_static_mojo_openapi_ReferenceableSecurityScheme_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_openapi_ReferenceableSecurityScheme_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_openapi_ReferenceableSecurityScheme_descriptor,
        new java.lang.String[] { "Reference", "SecurityScheme", "ReferenceableSecurityScheme", });
    org.mojolang.mojo.openapi.ReferenceProto.getDescriptor();
    org.mojolang.mojo.openapi.SecuritySchemeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
