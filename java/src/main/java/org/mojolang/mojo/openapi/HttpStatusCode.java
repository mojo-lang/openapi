// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/openapi/openapi.proto

package org.mojolang.mojo.openapi;

/**
 * Protobuf enum {@code mojo.openapi.HttpStatusCode}
 */
public enum HttpStatusCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HTTP_STATUS_CODE_DEFAULT = 0;</code>
   */
  HTTP_STATUS_CODE_DEFAULT(0),
  /**
   * <code>HTTP_STATUS_CODE_CODE_200 = 1;</code>
   */
  HTTP_STATUS_CODE_CODE_200(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HTTP_STATUS_CODE_DEFAULT = 0;</code>
   */
  public static final int HTTP_STATUS_CODE_DEFAULT_VALUE = 0;
  /**
   * <code>HTTP_STATUS_CODE_CODE_200 = 1;</code>
   */
  public static final int HTTP_STATUS_CODE_CODE_200_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static HttpStatusCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HttpStatusCode forNumber(int value) {
    switch (value) {
      case 0: return HTTP_STATUS_CODE_DEFAULT;
      case 1: return HTTP_STATUS_CODE_CODE_200;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HttpStatusCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HttpStatusCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HttpStatusCode>() {
          public HttpStatusCode findValueByNumber(int number) {
            return HttpStatusCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.mojolang.mojo.openapi.OpenapiProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final HttpStatusCode[] VALUES = values();

  public static HttpStatusCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private HttpStatusCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:mojo.openapi.HttpStatusCode)
}

