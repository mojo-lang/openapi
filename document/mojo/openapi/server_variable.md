| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `enum` | `Array<string>` | `` | 否 |  | An enumeration of string values to be used if the substitution options are from a limited set. |
| `default` | `string` | `` | 是 |  | The default value to use for substitution, and to send, if an alternate value is ** supplied.Unlike the `Schema` Object's `default`, this value ** be provided by the consumer. |
| `description` | `mojo.openapi.CachedDocument` | `` | 否 |  | An optional description for the server variable.CommonMark syntax MAY be used for rich text representation. |
