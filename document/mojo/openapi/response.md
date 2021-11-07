| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `description` | `string` | `` | 是 |  | A short description of the response. CommonMark syntax MAY be used for rich text representation. |
| `headers` | `` | `` | 否 |  | Maps a header name to its definition.RFC7230 states header names are case insensitive.If a response header is defined with the name "Content-Type", it SHALL be ignored. |
| `content` | `` | `` | 否 |  | A map containing descriptions of potential response payloads.The key is a media type or media type range and the value describes it.For responses that match multiple keys, only the most specific key is applicable.e.g. text/plain overrides text/* |
| `links` | `` | `` | 否 |  | A map of operations links that can be followed from the response.The key of the map is a short name for the link,following the naming constraints of the names for Component Objects. |
