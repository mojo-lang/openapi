// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/security_scheme.proto

package org.mojolang.mojo.openapi;

public interface SecuritySchemeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.SecurityScheme)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.openapi.SecurityScheme.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.mojo.openapi.SecurityScheme.Type type = 1;</code>
   * @return The type.
   */
  org.mojolang.mojo.openapi.SecurityScheme.Type getType();

  /**
   * <code>.mojo.openapi.CachedDocument description = 2;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>.mojo.openapi.CachedDocument description = 2;</code>
   * @return The description.
   */
  org.mojolang.mojo.openapi.CachedDocument getDescription();
  /**
   * <code>.mojo.openapi.CachedDocument description = 2;</code>
   */
  org.mojolang.mojo.openapi.CachedDocumentOrBuilder getDescriptionOrBuilder();

  /**
   * <code>string name = 5;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 5;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string in = 6;</code>
   * @return The in.
   */
  java.lang.String getIn();
  /**
   * <code>string in = 6;</code>
   * @return The bytes for in.
   */
  com.google.protobuf.ByteString
      getInBytes();

  /**
   * <code>string scheme = 10;</code>
   * @return The scheme.
   */
  java.lang.String getScheme();
  /**
   * <code>string scheme = 10;</code>
   * @return The bytes for scheme.
   */
  com.google.protobuf.ByteString
      getSchemeBytes();

  /**
   * <code>string bearer_format = 11;</code>
   * @return The bearerFormat.
   */
  java.lang.String getBearerFormat();
  /**
   * <code>string bearer_format = 11;</code>
   * @return The bytes for bearerFormat.
   */
  com.google.protobuf.ByteString
      getBearerFormatBytes();

  /**
   * <code>.mojo.openapi.OAuthFlows flows = 15;</code>
   * @return Whether the flows field is set.
   */
  boolean hasFlows();
  /**
   * <code>.mojo.openapi.OAuthFlows flows = 15;</code>
   * @return The flows.
   */
  org.mojolang.mojo.openapi.OAuthFlows getFlows();
  /**
   * <code>.mojo.openapi.OAuthFlows flows = 15;</code>
   */
  org.mojolang.mojo.openapi.OAuthFlowsOrBuilder getFlowsOrBuilder();

  /**
   * <code>.mojo.core.Url open_id_connect_url = 20;</code>
   * @return Whether the openIdConnectUrl field is set.
   */
  boolean hasOpenIdConnectUrl();
  /**
   * <code>.mojo.core.Url open_id_connect_url = 20;</code>
   * @return The openIdConnectUrl.
   */
  org.mojolang.mojo.core.Url getOpenIdConnectUrl();
  /**
   * <code>.mojo.core.Url open_id_connect_url = 20;</code>
   */
  org.mojolang.mojo.core.UrlOrBuilder getOpenIdConnectUrlOrBuilder();
}
