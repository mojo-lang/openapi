// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

public interface ReferenceablePathItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.ReferenceablePathItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   * @return Whether the reference field is set.
   */
  boolean hasReference();
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   * @return The reference.
   */
  org.mojolang.mojo.openapi.Reference getReference();
  /**
   * <code>.mojo.openapi.Reference reference = 1;</code>
   */
  org.mojolang.mojo.openapi.ReferenceOrBuilder getReferenceOrBuilder();

  /**
   * <code>.mojo.openapi.PathItem path_item = 2;</code>
   * @return Whether the pathItem field is set.
   */
  boolean hasPathItem();
  /**
   * <code>.mojo.openapi.PathItem path_item = 2;</code>
   * @return The pathItem.
   */
  org.mojolang.mojo.openapi.PathItem getPathItem();
  /**
   * <code>.mojo.openapi.PathItem path_item = 2;</code>
   */
  org.mojolang.mojo.openapi.PathItemOrBuilder getPathItemOrBuilder();

  public org.mojolang.mojo.openapi.ReferenceablePathItem.ReferenceablePathItemCase getReferenceablePathItemCase();
}
