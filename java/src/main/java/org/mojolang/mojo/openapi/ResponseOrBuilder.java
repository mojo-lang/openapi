// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

public interface ResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.Response)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string description = 1;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

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
   * <code>map&lt;string, .mojo.openapi.MediaType&gt; content = 3;</code>
   */
  int getContentCount();
  /**
   * <code>map&lt;string, .mojo.openapi.MediaType&gt; content = 3;</code>
   */
  boolean containsContent(
      java.lang.String key);
  /**
   * Use {@link #getContentMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.MediaType>
  getContent();
  /**
   * <code>map&lt;string, .mojo.openapi.MediaType&gt; content = 3;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.MediaType>
  getContentMap();
  /**
   * <code>map&lt;string, .mojo.openapi.MediaType&gt; content = 3;</code>
   */
  /* nullable */
org.mojolang.mojo.openapi.MediaType getContentOrDefault(
      java.lang.String key,
      /* nullable */
org.mojolang.mojo.openapi.MediaType defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.MediaType&gt; content = 3;</code>
   */
  org.mojolang.mojo.openapi.MediaType getContentOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableLink&gt; links = 4;</code>
   */
  int getLinksCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableLink&gt; links = 4;</code>
   */
  boolean containsLinks(
      java.lang.String key);
  /**
   * Use {@link #getLinksMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableLink>
  getLinks();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableLink&gt; links = 4;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableLink>
  getLinksMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableLink&gt; links = 4;</code>
   */
  /* nullable */
org.mojolang.mojo.openapi.ReferenceableLink getLinksOrDefault(
      java.lang.String key,
      /* nullable */
org.mojolang.mojo.openapi.ReferenceableLink defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableLink&gt; links = 4;</code>
   */
  org.mojolang.mojo.openapi.ReferenceableLink getLinksOrThrow(
      java.lang.String key);
}
