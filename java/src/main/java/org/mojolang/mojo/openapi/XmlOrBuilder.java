// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/xml.proto

package org.mojolang.mojo.openapi;

public interface XmlOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.Xml)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.mojo.core.Url namespace = 2;</code>
   * @return Whether the namespace field is set.
   */
  boolean hasNamespace();
  /**
   * <code>.mojo.core.Url namespace = 2;</code>
   * @return The namespace.
   */
  org.mojolang.mojo.core.Url getNamespace();
  /**
   * <code>.mojo.core.Url namespace = 2;</code>
   */
  org.mojolang.mojo.core.UrlOrBuilder getNamespaceOrBuilder();

  /**
   * <code>string prefix = 3;</code>
   * @return The prefix.
   */
  java.lang.String getPrefix();
  /**
   * <code>string prefix = 3;</code>
   * @return The bytes for prefix.
   */
  com.google.protobuf.ByteString
      getPrefixBytes();

  /**
   * <code>bool attribute = 10;</code>
   * @return The attribute.
   */
  boolean getAttribute();

  /**
   * <code>bool wrapped = 11;</code>
   * @return The wrapped.
   */
  boolean getWrapped();
}
