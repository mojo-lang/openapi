| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `ref` | `string` |  | 否 |  | Allows for an external definition of this path item.The referenced structure MUST be in the format of a Path Item Object.If there are conflicts between the referenced definition and this Path Item's definition,the behavior is undefined. |
| `summary` | `string` |  | 否 |  | An optional, string summary, intended to apply to all operations in this path. |
| `description` | `mojo.openapi.CachedDocument` |  | 否 |  | An optional, string description, intended to apply to all operations in this path. |
| `get` | `mojo.openapi.Operation` |  | 否 |  | A definition of a GET operation on this path. |
| `put` | `mojo.openapi.Operation` |  | 否 |  | A definition of a PUT operation on this path. |
| `post` | `mojo.openapi.Operation` |  | 否 |  | A definition of a POST operation on this path. |
| `delete` | `mojo.openapi.Operation` |  | 否 |  | A definition of a DELETE operation on this path. |
| `options` | `mojo.openapi.Operation` |  | 否 |  | A definition of a OPTIONS operation on this path. |
| `head` | `mojo.openapi.Operation` |  | 否 |  | A definition of a HEAD operation on this path. |
| `patch` | `mojo.openapi.Operation` |  | 否 |  | A definition of a PATCH operation on this path. |
| `trace` | `mojo.openapi.Operation` |  | 否 |  | A definition of a TRACE operation on this path. |
| `servers` | `Array<mojo.openapi.Server>` |  | 否 |  | An alternative server array to service all operations in this path. |
| `parameters` | `Array<mojo.openapi.ReferenceableParameter>` |  | 否 |  | A list of parameters that are applicable for all the operations described under this path. These parameters can be overridden at the operation level, but cannot be removed there. The list MUST NOT include duplicated parameters. A unique parameter is defined by a combination of a name and location. The list can use the Reference Object to link to parameters that are defined at the OpenAPI Object's components/parameters. |
