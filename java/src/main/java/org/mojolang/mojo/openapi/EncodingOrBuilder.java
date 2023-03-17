// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

public interface EncodingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.Encoding)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string content_type = 1;</code>
   * @return The contentType.
   */
  java.lang.String getContentType();
  /**
   * <code>string content_type = 1;</code>
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString
      getContentTypeBytes();

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
   */
  int getHeadersCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader>
  getHeaders();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader>
  getHeadersMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
   */
  /* nullable */
org.mojolang.mojo.openapi.ReferenceableHeader getHeadersOrDefault(
      java.lang.String key,
      /* nullable */
org.mojolang.mojo.openapi.ReferenceableHeader defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 2;</code>
   */
  org.mojolang.mojo.openapi.ReferenceableHeader getHeadersOrThrow(
      java.lang.String key);

  /**
   * <code>string style = 3;</code>
   * @return The style.
   */
  java.lang.String getStyle();
  /**
   * <code>string style = 3;</code>
   * @return The bytes for style.
   */
  com.google.protobuf.ByteString
      getStyleBytes();

  /**
   * <code>bool explode = 4;</code>
   * @return The explode.
   */
  boolean getExplode();

  /**
   * <code>bool allow_reserved = 5;</code>
   * @return The allowReserved.
   */
  boolean getAllowReserved();
}
