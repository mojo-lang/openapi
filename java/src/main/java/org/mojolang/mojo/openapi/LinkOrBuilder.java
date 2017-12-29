// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/link.proto

package org.mojolang.mojo.openapi;

public interface LinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.Link)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string operation_ref = 1;</code>
   * @return The operationRef.
   */
  java.lang.String getOperationRef();
  /**
   * <code>string operation_ref = 1;</code>
   * @return The bytes for operationRef.
   */
  com.google.protobuf.ByteString
      getOperationRefBytes();

  /**
   * <code>string operation_id = 2;</code>
   * @return The operationId.
   */
  java.lang.String getOperationId();
  /**
   * <code>string operation_id = 2;</code>
   * @return The bytes for operationId.
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();

  /**
   * <code>map&lt;string, .mojo.core.Any&gt; parameters = 3;</code>
   */
  int getParametersCount();
  /**
   * <code>map&lt;string, .mojo.core.Any&gt; parameters = 3;</code>
   */
  boolean containsParameters(
      java.lang.String key);
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.core.Any>
  getParameters();
  /**
   * <code>map&lt;string, .mojo.core.Any&gt; parameters = 3;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.core.Any>
  getParametersMap();
  /**
   * <code>map&lt;string, .mojo.core.Any&gt; parameters = 3;</code>
   */

  org.mojolang.mojo.core.Any getParametersOrDefault(
      java.lang.String key,
      org.mojolang.mojo.core.Any defaultValue);
  /**
   * <code>map&lt;string, .mojo.core.Any&gt; parameters = 3;</code>
   */

  org.mojolang.mojo.core.Any getParametersOrThrow(
      java.lang.String key);

  /**
   * <code>.mojo.core.Any request_body = 4;</code>
   * @return Whether the requestBody field is set.
   */
  boolean hasRequestBody();
  /**
   * <code>.mojo.core.Any request_body = 4;</code>
   * @return The requestBody.
   */
  org.mojolang.mojo.core.Any getRequestBody();
  /**
   * <code>.mojo.core.Any request_body = 4;</code>
   */
  org.mojolang.mojo.core.AnyOrBuilder getRequestBodyOrBuilder();

  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.mojo.openapi.Server server = 6;</code>
   * @return Whether the server field is set.
   */
  boolean hasServer();
  /**
   * <code>.mojo.openapi.Server server = 6;</code>
   * @return The server.
   */
  org.mojolang.mojo.openapi.Server getServer();
  /**
   * <code>.mojo.openapi.Server server = 6;</code>
   */
  org.mojolang.mojo.openapi.ServerOrBuilder getServerOrBuilder();
}
