| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `title` | `string` |  | 是 |  | The title of the application. |
| `description` | `mojo.openapi.CachedDocument` |  | 否 |  | A short description of the application.CommonMark syntax syntax MAY be used for rich text representation. |
| `termsOfService` | `string` | `Url` | 否 |  | A URL to the Terms of Service for the API. |
| `contact` | `mojo.openapi.Contact` |  | 否 |  | The contact information for the exposed API. |
| `license` | `mojo.openapi.License` |  | 否 |  | The license information for the exposed API. |
| `version` | `mojo.core.Version` |  | 是 |  | Provides the version of the application API (not to be confused with the specification version) |
