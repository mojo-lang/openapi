// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

public interface PathItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.PathItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ref = 1 [(.mojo.alias) = "$ref"];</code>
   * @return The ref.
   */
  java.lang.String getRef();
  /**
   * <code>string ref = 1 [(.mojo.alias) = "$ref"];</code>
   * @return The bytes for ref.
   */
  com.google.protobuf.ByteString
      getRefBytes();

  /**
   * <code>string summary = 2;</code>
   * @return The summary.
   */
  java.lang.String getSummary();
  /**
   * <code>string summary = 2;</code>
   * @return The bytes for summary.
   */
  com.google.protobuf.ByteString
      getSummaryBytes();

  /**
   * <code>.mojo.openapi.CachedDocument description = 3;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>.mojo.openapi.CachedDocument description = 3;</code>
   * @return The description.
   */
  org.mojolang.mojo.openapi.CachedDocument getDescription();
  /**
   * <code>.mojo.openapi.CachedDocument description = 3;</code>
   */
  org.mojolang.mojo.openapi.CachedDocumentOrBuilder getDescriptionOrBuilder();

  /**
   * <code>.mojo.openapi.Operation get = 5;</code>
   * @return Whether the get field is set.
   */
  boolean hasGet();
  /**
   * <code>.mojo.openapi.Operation get = 5;</code>
   * @return The get.
   */
  org.mojolang.mojo.openapi.Operation getGet();
  /**
   * <code>.mojo.openapi.Operation get = 5;</code>
   */
  org.mojolang.mojo.openapi.OperationOrBuilder getGetOrBuilder();

  /**
   * <code>.mojo.openapi.Operation put = 6;</code>
   * @return Whether the put field is set.
   */
  boolean hasPut();
  /**
   * <code>.mojo.openapi.Operation put = 6;</code>
   * @return The put.
   */
  org.mojolang.mojo.openapi.Operation getPut();
  /**
   * <code>.mojo.openapi.Operation put = 6;</code>
   */
  org.mojolang.mojo.openapi.OperationOrBuilder getPutOrBuilder();

  /**
   * <code>.mojo.openapi.Operation post = 7;</code>
   * @return Whether the post field is set.
   */
  boolean hasPost();
  /**
   * <code>.mojo.openapi.Operation post = 7;</code>
   * @return The post.
   */
  org.mojolang.mojo.openapi.Operation getPost();
  /**
   * <code>.mojo.openapi.Operation post = 7;</code>
   */
  org.mojolang.mojo.openapi.OperationOrBuilder getPostOrBuilder();

  /**
   * <code>.mojo.openapi.Operation delete = 8;</code>
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   * <code>.mojo.openapi.Operation delete = 8;</code>
   * @return The delete.
   */
  org.mojolang.mojo.openapi.Operation getDelete();
  /**
   * <code>.mojo.openapi.Operation delete = 8;</code>
   */
  org.mojolang.mojo.openapi.OperationOrBuilder getDeleteOrBuilder();

  /**
   * <code>.mojo.openapi.Operation options = 9;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>.mojo.openapi.Operation options = 9;</code>
   * @return The options.
   */
  org.mojolang.mojo.openapi.Operation getOptions();
  /**
   * <code>.mojo.openapi.Operation options = 9;</code>
   */
  org.mojolang.mojo.openapi.OperationOrBuilder getOptionsOrBuilder();

  /**
   * <code>.mojo.openapi.Operation head = 10;</code>
   * @return Whether the head field is set.
   */
  boolean hasHead();
  /**
   * <code>.mojo.openapi.Operation head = 10;</code>
   * @return The head.
   */
  org.mojolang.mojo.openapi.Operation getHead();
  /**
   * <code>.mojo.openapi.Operation head = 10;</code>
   */
  org.mojolang.mojo.openapi.OperationOrBuilder getHeadOrBuilder();

  /**
   * <code>.mojo.openapi.Operation patch = 11;</code>
   * @return Whether the patch field is set.
   */
  boolean hasPatch();
  /**
   * <code>.mojo.openapi.Operation patch = 11;</code>
   * @return The patch.
   */
  org.mojolang.mojo.openapi.Operation getPatch();
  /**
   * <code>.mojo.openapi.Operation patch = 11;</code>
   */
  org.mojolang.mojo.openapi.OperationOrBuilder getPatchOrBuilder();

  /**
   * <code>.mojo.openapi.Operation trace = 12;</code>
   * @return Whether the trace field is set.
   */
  boolean hasTrace();
  /**
   * <code>.mojo.openapi.Operation trace = 12;</code>
   * @return The trace.
   */
  org.mojolang.mojo.openapi.Operation getTrace();
  /**
   * <code>.mojo.openapi.Operation trace = 12;</code>
   */
  org.mojolang.mojo.openapi.OperationOrBuilder getTraceOrBuilder();

  /**
   * <code>repeated .mojo.openapi.Server servers = 13;</code>
   */
  java.util.List<org.mojolang.mojo.openapi.Server> 
      getServersList();
  /**
   * <code>repeated .mojo.openapi.Server servers = 13;</code>
   */
  org.mojolang.mojo.openapi.Server getServers(int index);
  /**
   * <code>repeated .mojo.openapi.Server servers = 13;</code>
   */
  int getServersCount();
  /**
   * <code>repeated .mojo.openapi.Server servers = 13;</code>
   */
  java.util.List<? extends org.mojolang.mojo.openapi.ServerOrBuilder> 
      getServersOrBuilderList();
  /**
   * <code>repeated .mojo.openapi.Server servers = 13;</code>
   */
  org.mojolang.mojo.openapi.ServerOrBuilder getServersOrBuilder(
      int index);

  /**
   * <code>repeated .mojo.openapi.ReferenceableParameter parameters = 15;</code>
   */
  java.util.List<org.mojolang.mojo.openapi.ReferenceableParameter> 
      getParametersList();
  /**
   * <code>repeated .mojo.openapi.ReferenceableParameter parameters = 15;</code>
   */
  org.mojolang.mojo.openapi.ReferenceableParameter getParameters(int index);
  /**
   * <code>repeated .mojo.openapi.ReferenceableParameter parameters = 15;</code>
   */
  int getParametersCount();
  /**
   * <code>repeated .mojo.openapi.ReferenceableParameter parameters = 15;</code>
   */
  java.util.List<? extends org.mojolang.mojo.openapi.ReferenceableParameterOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <code>repeated .mojo.openapi.ReferenceableParameter parameters = 15;</code>
   */
  org.mojolang.mojo.openapi.ReferenceableParameterOrBuilder getParametersOrBuilder(
      int index);
}
