// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

public interface PathsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.Paths)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .mojo.openapi.PathItem&gt; vals = 1;</code>
   */
  int getValsCount();
  /**
   * <code>map&lt;string, .mojo.openapi.PathItem&gt; vals = 1;</code>
   */
  boolean containsVals(
      java.lang.String key);
  /**
   * Use {@link #getValsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem>
  getVals();
  /**
   * <code>map&lt;string, .mojo.openapi.PathItem&gt; vals = 1;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.PathItem>
  getValsMap();
  /**
   * <code>map&lt;string, .mojo.openapi.PathItem&gt; vals = 1;</code>
   */
  /* nullable */
org.mojolang.mojo.openapi.PathItem getValsOrDefault(
      java.lang.String key,
      /* nullable */
org.mojolang.mojo.openapi.PathItem defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.PathItem&gt; vals = 1;</code>
   */
  org.mojolang.mojo.openapi.PathItem getValsOrThrow(
      java.lang.String key);
}
