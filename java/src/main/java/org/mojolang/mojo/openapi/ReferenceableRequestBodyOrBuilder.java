// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

public interface ReferenceableRequestBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.ReferenceableRequestBody)
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
   * <code>.mojo.openapi.RequestBody request_body = 2;</code>
   * @return Whether the requestBody field is set.
   */
  boolean hasRequestBody();
  /**
   * <code>.mojo.openapi.RequestBody request_body = 2;</code>
   * @return The requestBody.
   */
  org.mojolang.mojo.openapi.RequestBody getRequestBody();
  /**
   * <code>.mojo.openapi.RequestBody request_body = 2;</code>
   */
  org.mojolang.mojo.openapi.RequestBodyOrBuilder getRequestBodyOrBuilder();

  public org.mojolang.mojo.openapi.ReferenceableRequestBody.ReferenceableRequestBodyCase getReferenceableRequestBodyCase();
}
