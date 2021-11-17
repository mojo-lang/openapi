| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `discriminator` | `mojo.openapi.Discriminator` | `` | 否 |  | Adds support for polymorphism. The discriminator is an object name that is used to differentiate between other schemas which may satisfy the payload description. See Composition and Inheritance for more details. |
| `xml` | `mojo.openapi.Xml` | `` | 否 |  | This MAY be used only on properties schemas. It has no effect on root schemas. Adds additional metadata to describe the XML representation of this property. |
| `externalDocs` | `mojo.openapi.ExternalDocument` | `` | 否 |  | Additional external documentation for this schema. |
| `example` | `mojo.core.Any` | `` | 否 |  | A free-form property to include an example of an instance for this schema. To represent examples that cannot be naturally represented in JSON or YAML, a string value can be used to contain the example with escaping where necessary. |
| `title` | `string` | `` | 否 |  |
| `description` | `mojo.openapi.CachedDocument` | `` | 否 |  | support GFM |
| `type` | `string` | `` | 否 |  | Value MUST be a string. Multiple types via an array are not supported. |
| `format` | `string` | `` | 否 |  | format is an open string-valued property,and can have any value. Formats such as "Email", "Uuid", and so on,MAY be used even though undefined by this specification.Types that are not accompanied by a format property follow the type definition in the JSON Schema.Tools that do not recognize a specific format MAY default back to the type alone, as if the format is not specified. |
| `multipleOf` | `integer` | `int64` | 否 |  | The value of "multipleOf" MUST be a number, strictly greater than 0.<br>A numeric instance is valid only if division by this keyword's value results in an integer. |
| `maximum` | `number` | `` | 否 |  |
| `exclusiveMaximum` | `number` | `` | 否 |  |
| `minimum` | `number` | `` | 否 |  |
| `exclusiveMinimum` | `number` | `` | 否 |  |
| `maxLength` | `integer` | `uint64` | 否 |  |
| `minLength` | `integer` | `uint64` | 否 |  | A string instance is valid against this keyword if its length is greater than, or equal to, the value of this keyword.The length of a string instance is defined as the number of its characters as defined by RFC 7159.Omitting this keyword has the same behavior as a value of 0. |
| `pattern` | `mojo.core.Regex` | `` | 否 |  |
| `items` | `unspecified` | `` | 否 |  | Value MUST be an object and not an array. Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema. items MUST be present if the type is array. |
| `maxItems` | `integer` | `uint64` | 否 |  |
| `minItems` | `integer` | `uint64` | 否 |  |
| `uniqueItems` | `boolean` | `` | 否 |  |
| `properties` | `Map<string, unspecified>` | `` | 否 |  |
| `additionalProperties` | `unspecified` | `` | 否 |  |
| `maxProperties` | `integer` | `uint64` | 否 |  |
| `minProperties` | `integer` | `uint64` | 否 |  |
| `required` | `Array<string>` | `` | 否 |  |
| `enum` | `Array<unspecified>` | `` | 否 |  |
| `allOf` | `Array<unspecified>` | `` | 否 |  | Inline or referenced schema MUST be of a Schema Object and not a standard JSON Schema.validates the value against all the sub-schemas |
| `oneOf` | `Array<unspecified>` | `` | 否 |  | validates the value against exactly one of the sub-schemas |
| `anyOf` | `Array<unspecified>` | `` | 否 |  | validates the value against any (one or more) of the sub-schemas |
| `not` | `unspecified` | `` | 否 |  | make sure the value is not valid against the specified schema. |
| `default` | `mojo.core.Any` | `` | 否 |  |
| `nullable` | `boolean` | `` | 否 |  | Allows sending a null value for the defined schema. Default value is false. |
| `readOnly` | `boolean` | `` | 否 |  | Relevant only for Schema "properties" definitions. Declares the property as "read only". This means that it MAY be sent as part of a response but SHOULD NOT be sent as part of the request. If the property is marked as readOnly being true and is in the required list, the required will take effect on the response only. A property MUST NOT be marked as both readOnly and writeOnly being true. Default value is false. |
| `writeOnly` | `boolean` | `` | 否 |  | Relevant only for Schema "properties" definitions. Declares the property as "write only". Therefore, it MAY be sent as part of a request but SHOULD NOT be sent as part of the response. If the property is marked as writeOnly being true and is in the required list, the required will take effect on the request only. A property MUST NOT be marked as both readOnly and writeOnly being true. Default value is false. |
| `deprecated` | `boolean` | `` | 否 |  | Specifies that a schema is deprecated and SHOULD be transitioned out of usage. Default value is false. |
