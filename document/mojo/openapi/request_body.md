| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `description` | `mojo.openapi.CachedDocument` | `` | 否 |  | A brief description of the request body.This could contain examples of use. CommonMark syntax MAY be used for rich text representation. |
| `content` | `Map<string, mojo.openapi.MediaType>` | `` | 是 |  | The content of the request body.The key is a media type or media type range and the value describes it.For requests that match multiple keys, only the most specific key is applicable.e.g. text/plain overrides text/* |
| `required` | `boolean` | `` | 否 |  | Determines if the request body is required in the request. |
