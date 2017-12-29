// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

public interface OpenAPIOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.openapi.OpenAPI)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.core.Version openapi = 1;</code>
   * @return Whether the openapi field is set.
   */
  boolean hasOpenapi();
  /**
   * <code>.mojo.core.Version openapi = 1;</code>
   * @return The openapi.
   */
  org.mojolang.mojo.core.Version getOpenapi();
  /**
   * <code>.mojo.core.Version openapi = 1;</code>
   */
  org.mojolang.mojo.core.VersionOrBuilder getOpenapiOrBuilder();

  /**
   * <code>.mojo.openapi.Info info = 2;</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.mojo.openapi.Info info = 2;</code>
   * @return The info.
   */
  org.mojolang.mojo.openapi.Info getInfo();
  /**
   * <code>.mojo.openapi.Info info = 2;</code>
   */
  org.mojolang.mojo.openapi.InfoOrBuilder getInfoOrBuilder();

  /**
   * <code>repeated .mojo.openapi.Server servers = 4;</code>
   */
  java.util.List<org.mojolang.mojo.openapi.Server> 
      getServersList();
  /**
   * <code>repeated .mojo.openapi.Server servers = 4;</code>
   */
  org.mojolang.mojo.openapi.Server getServers(int index);
  /**
   * <code>repeated .mojo.openapi.Server servers = 4;</code>
   */
  int getServersCount();
  /**
   * <code>repeated .mojo.openapi.Server servers = 4;</code>
   */
  java.util.List<? extends org.mojolang.mojo.openapi.ServerOrBuilder> 
      getServersOrBuilderList();
  /**
   * <code>repeated .mojo.openapi.Server servers = 4;</code>
   */
  org.mojolang.mojo.openapi.ServerOrBuilder getServersOrBuilder(
      int index);

  /**
   * <code>.mojo.openapi.Paths paths = 5;</code>
   * @return Whether the paths field is set.
   */
  boolean hasPaths();
  /**
   * <code>.mojo.openapi.Paths paths = 5;</code>
   * @return The paths.
   */
  org.mojolang.mojo.openapi.Paths getPaths();
  /**
   * <code>.mojo.openapi.Paths paths = 5;</code>
   */
  org.mojolang.mojo.openapi.PathsOrBuilder getPathsOrBuilder();

  /**
   * <code>.mojo.openapi.Components components = 10;</code>
   * @return Whether the components field is set.
   */
  boolean hasComponents();
  /**
   * <code>.mojo.openapi.Components components = 10;</code>
   * @return The components.
   */
  org.mojolang.mojo.openapi.Components getComponents();
  /**
   * <code>.mojo.openapi.Components components = 10;</code>
   */
  org.mojolang.mojo.openapi.ComponentsOrBuilder getComponentsOrBuilder();

  /**
   * <code>.mojo.openapi.SecurityRequirement security = 11;</code>
   * @return Whether the security field is set.
   */
  boolean hasSecurity();
  /**
   * <code>.mojo.openapi.SecurityRequirement security = 11;</code>
   * @return The security.
   */
  org.mojolang.mojo.openapi.SecurityRequirement getSecurity();
  /**
   * <code>.mojo.openapi.SecurityRequirement security = 11;</code>
   */
  org.mojolang.mojo.openapi.SecurityRequirementOrBuilder getSecurityOrBuilder();

  /**
   * <code>repeated .mojo.openapi.Tag tags = 12;</code>
   */
  java.util.List<org.mojolang.mojo.openapi.Tag> 
      getTagsList();
  /**
   * <code>repeated .mojo.openapi.Tag tags = 12;</code>
   */
  org.mojolang.mojo.openapi.Tag getTags(int index);
  /**
   * <code>repeated .mojo.openapi.Tag tags = 12;</code>
   */
  int getTagsCount();
  /**
   * <code>repeated .mojo.openapi.Tag tags = 12;</code>
   */
  java.util.List<? extends org.mojolang.mojo.openapi.TagOrBuilder> 
      getTagsOrBuilderList();
  /**
   * <code>repeated .mojo.openapi.Tag tags = 12;</code>
   */
  org.mojolang.mojo.openapi.TagOrBuilder getTagsOrBuilder(
      int index);

  /**
   * <code>.mojo.openapi.ExternalDocument external_docs = 13;</code>
   * @return Whether the externalDocs field is set.
   */
  boolean hasExternalDocs();
  /**
   * <code>.mojo.openapi.ExternalDocument external_docs = 13;</code>
   * @return The externalDocs.
   */
  org.mojolang.mojo.openapi.ExternalDocument getExternalDocs();
  /**
   * <code>.mojo.openapi.ExternalDocument external_docs = 13;</code>
   */
  org.mojolang.mojo.openapi.ExternalDocumentOrBuilder getExternalDocsOrBuilder();
}
