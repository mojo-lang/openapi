// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/security_requirement.proto

package org.mojolang.mojo.openapi;

public interface SecurityRequirementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.SecurityRequirement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
   */
  int getValsCount();
  /**
   * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
   */
  boolean containsVals(
      java.lang.String key);
  /**
   * Use {@link #getValsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings>
  getVals();
  /**
   * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
   */
  java.util.Map<java.lang.String, org.mojolang.mojo.core.Strings>
  getValsMap();
  /**
   * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
   */

  org.mojolang.mojo.core.Strings getValsOrDefault(
      java.lang.String key,
      org.mojolang.mojo.core.Strings defaultValue);
  /**
   * <code>map&lt;string, .mojo.core.Strings&gt; vals = 1;</code>
   */

  org.mojolang.mojo.core.Strings getValsOrThrow(
      java.lang.String key);
}
