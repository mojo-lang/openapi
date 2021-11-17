| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `url` | `string` | `url` | 是 |  | A URL to the target host.This URL supports Server Variables and MAY be relative, to indicate that the host location is relative to the location where the OpenAPI document is being served.Variable substitutions will be made when a variable is named in {brackets}. |
| `description` | `mojo.openapi.CachedDocument` | `` | 否 |  | An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text representation. |
| `variables` | `Map<string, mojo.openapi.ServerVariable>` | `` | 否 |  | A map between a variable name and its value.The value is used for substitution in the server's URL template. |
