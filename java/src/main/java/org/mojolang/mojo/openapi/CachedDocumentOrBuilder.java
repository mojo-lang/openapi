// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/cached_document.proto

package org.mojolang.mojo.openapi;

public interface CachedDocumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.CachedDocument)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cache = 1;</code>
   * @return The cache.
   */
  java.lang.String getCache();
  /**
   * <code>string cache = 1;</code>
   * @return The bytes for cache.
   */
  com.google.protobuf.ByteString
      getCacheBytes();

  /**
   * <code>.mojo.document.Document value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.mojo.document.Document value = 2;</code>
   * @return The value.
   */
  org.mojolang.mojo.document.Document getValue();
  /**
   * <code>.mojo.document.Document value = 2;</code>
   */
  org.mojolang.mojo.document.DocumentOrBuilder getValueOrBuilder();
}
