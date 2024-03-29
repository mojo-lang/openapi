// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/oauth_flow.proto

package org.mojolang.mojo.openapi;

public interface OAuthFlowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.OAuthFlow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.core.Url authorization_url = 1;</code>
   * @return Whether the authorizationUrl field is set.
   */
  boolean hasAuthorizationUrl();
  /**
   * <code>.mojo.core.Url authorization_url = 1;</code>
   * @return The authorizationUrl.
   */
  org.mojolang.mojo.core.Url getAuthorizationUrl();
  /**
   * <code>.mojo.core.Url authorization_url = 1;</code>
   */
  org.mojolang.mojo.core.UrlOrBuilder getAuthorizationUrlOrBuilder();

  /**
   * <code>.mojo.core.Url token_url = 2;</code>
   * @return Whether the tokenUrl field is set.
   */
  boolean hasTokenUrl();
  /**
   * <code>.mojo.core.Url token_url = 2;</code>
   * @return The tokenUrl.
   */
  org.mojolang.mojo.core.Url getTokenUrl();
  /**
   * <code>.mojo.core.Url token_url = 2;</code>
   */
  org.mojolang.mojo.core.UrlOrBuilder getTokenUrlOrBuilder();

  /**
   * <code>.mojo.core.Url refresh_url = 3;</code>
   * @return Whether the refreshUrl field is set.
   */
  boolean hasRefreshUrl();
  /**
   * <code>.mojo.core.Url refresh_url = 3;</code>
   * @return The refreshUrl.
   */
  org.mojolang.mojo.core.Url getRefreshUrl();
  /**
   * <code>.mojo.core.Url refresh_url = 3;</code>
   */
  org.mojolang.mojo.core.UrlOrBuilder getRefreshUrlOrBuilder();

  /**
   * <code>map&lt;string, string&gt; scopes = 10;</code>
   */
  int getScopesCount();
  /**
   * <code>map&lt;string, string&gt; scopes = 10;</code>
   */
  boolean containsScopes(
      java.lang.String key);
  /**
   * Use {@link #getScopesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getScopes();
  /**
   * <code>map&lt;string, string&gt; scopes = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getScopesMap();
  /**
   * <code>map&lt;string, string&gt; scopes = 10;</code>
   */
  /* nullable */
java.lang.String getScopesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; scopes = 10;</code>
   */
  java.lang.String getScopesOrThrow(
      java.lang.String key);
}
