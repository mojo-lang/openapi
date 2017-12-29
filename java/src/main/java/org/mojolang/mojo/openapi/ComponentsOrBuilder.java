// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

public interface ComponentsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.Components)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .mojo.openapi.Schema&gt; schemas = 1;</code>
   */
  int getSchemasCount();
  /**
   * <code>map&lt;string, .mojo.openapi.Schema&gt; schemas = 1;</code>
   */
  boolean containsSchemas(
      java.lang.String key);
  /**
   * Use {@link #getSchemasMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.Schema>
  getSchemas();
  /**
   * <code>map&lt;string, .mojo.openapi.Schema&gt; schemas = 1;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.Schema>
  getSchemasMap();
  /**
   * <code>map&lt;string, .mojo.openapi.Schema&gt; schemas = 1;</code>
   */

  org.mojolang.mojo.openapi.Schema getSchemasOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.Schema defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.Schema&gt; schemas = 1;</code>
   */

  org.mojolang.mojo.openapi.Schema getSchemasOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; responses = 2;</code>
   */
  int getResponsesCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; responses = 2;</code>
   */
  boolean containsResponses(
      java.lang.String key);
  /**
   * Use {@link #getResponsesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse>
  getResponses();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; responses = 2;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableResponse>
  getResponsesMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; responses = 2;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableResponse getResponsesOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.ReferenceableResponse defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableResponse&gt; responses = 2;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableResponse getResponsesOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableParameter&gt; parameters = 3;</code>
   */
  int getParametersCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableParameter&gt; parameters = 3;</code>
   */
  boolean containsParameters(
      java.lang.String key);
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableParameter>
  getParameters();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableParameter&gt; parameters = 3;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableParameter>
  getParametersMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableParameter&gt; parameters = 3;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableParameter getParametersOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.ReferenceableParameter defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableParameter&gt; parameters = 3;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableParameter getParametersOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableExample&gt; examples = 4;</code>
   */
  int getExamplesCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableExample&gt; examples = 4;</code>
   */
  boolean containsExamples(
      java.lang.String key);
  /**
   * Use {@link #getExamplesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableExample>
  getExamples();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableExample&gt; examples = 4;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableExample>
  getExamplesMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableExample&gt; examples = 4;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableExample getExamplesOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.ReferenceableExample defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableExample&gt; examples = 4;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableExample getExamplesOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableRequestBody&gt; request_bodies = 5;</code>
   */
  int getRequestBodiesCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableRequestBody&gt; request_bodies = 5;</code>
   */
  boolean containsRequestBodies(
      java.lang.String key);
  /**
   * Use {@link #getRequestBodiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableRequestBody>
  getRequestBodies();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableRequestBody&gt; request_bodies = 5;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableRequestBody>
  getRequestBodiesMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableRequestBody&gt; request_bodies = 5;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableRequestBody getRequestBodiesOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.ReferenceableRequestBody defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableRequestBody&gt; request_bodies = 5;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableRequestBody getRequestBodiesOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 6;</code>
   */
  int getHeadersCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 6;</code>
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
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 6;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableHeader>
  getHeadersMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 6;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableHeader getHeadersOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.ReferenceableHeader defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableHeader&gt; headers = 6;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableHeader getHeadersOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableSecurityScheme&gt; security_schemes = 7;</code>
   */
  int getSecuritySchemesCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableSecurityScheme&gt; security_schemes = 7;</code>
   */
  boolean containsSecuritySchemes(
      java.lang.String key);
  /**
   * Use {@link #getSecuritySchemesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableSecurityScheme>
  getSecuritySchemes();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableSecurityScheme&gt; security_schemes = 7;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableSecurityScheme>
  getSecuritySchemesMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableSecurityScheme&gt; security_schemes = 7;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableSecurityScheme getSecuritySchemesOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.ReferenceableSecurityScheme defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableSecurityScheme&gt; security_schemes = 7;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableSecurityScheme getSecuritySchemesOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableLink&gt; links = 8;</code>
   */
  int getLinksCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableLink&gt; links = 8;</code>
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
   * <code>map&lt;string, .mojo.openapi.ReferenceableLink&gt; links = 8;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableLink>
  getLinksMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableLink&gt; links = 8;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableLink getLinksOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.ReferenceableLink defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableLink&gt; links = 8;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableLink getLinksOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableCallback&gt; callbacks = 9;</code>
   */
  int getCallbacksCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableCallback&gt; callbacks = 9;</code>
   */
  boolean containsCallbacks(
      java.lang.String key);
  /**
   * Use {@link #getCallbacksMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableCallback>
  getCallbacks();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableCallback&gt; callbacks = 9;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceableCallback>
  getCallbacksMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableCallback&gt; callbacks = 9;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableCallback getCallbacksOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.ReferenceableCallback defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceableCallback&gt; callbacks = 9;</code>
   */

  org.mojolang.mojo.openapi.ReferenceableCallback getCallbacksOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceablePathItem&gt; path_items = 10;</code>
   */
  int getPathItemsCount();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceablePathItem&gt; path_items = 10;</code>
   */
  boolean containsPathItems(
      java.lang.String key);
  /**
   * Use {@link #getPathItemsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceablePathItem>
  getPathItems();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceablePathItem&gt; path_items = 10;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.openapi.ReferenceablePathItem>
  getPathItemsMap();
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceablePathItem&gt; path_items = 10;</code>
   */

  org.mojolang.mojo.openapi.ReferenceablePathItem getPathItemsOrDefault(
      java.lang.String key,
      org.mojolang.mojo.openapi.ReferenceablePathItem defaultValue);
  /**
   * <code>map&lt;string, .mojo.openapi.ReferenceablePathItem&gt; path_items = 10;</code>
   */

  org.mojolang.mojo.openapi.ReferenceablePathItem getPathItemsOrThrow(
      java.lang.String key);
}
