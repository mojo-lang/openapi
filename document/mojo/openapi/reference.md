| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `ref` | `string` | `Url` | 是 |  | The reference Url string. |
| `summary` | `string` |  | 否 |  | A short summary which by default SHOULD override that of the referenced component. If the referenced object-type does not allow a summary field, then this field has no effect. |
| `description` | `mojo.openapi.CachedDocument` |  | 否 |  | A description which by default SHOULD override that of the referenced component. CommonMark syntax MAY be used for rich text representation. If the referenced object-type does not allow a description field, then this field has no effect. |
