| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `operationRef` | `string` |  | 否 |  | A relative or absolute reference to an OAS operation. This field is mutually exclusive of the operationId field, and MUST point to an Operation Object. Relative operationRef values MAY be used to locate an existing Operation Object in the OpenAPI definition. |
| `operationId` | `string` |  | 否 |  | The name of an existing, resolvable OAS operation, as defined with a unique operationId. This field is mutually exclusive of the operationRef field. |
| `parameters` | `Map<string, mojo.core.Any>` |  | 否 |  | A map representing parameters to pass to an operation as specified with operationId or identified via operationRef. The key is the parameter name to be used, whereas the value can be a constant or an expression to be evaluated and passed to the linked operation. The parameter name can be qualified using the parameter location [{in}.]{name} for operations that use the same parameter name in different locations (e.g. path.id). |
| `requestBody` | `mojo.core.Any` |  | 否 |  | A literal value or {expression} to use as a request body when calling the target operation. |
| `description` | `string` |  | 否 |  | A description of the link. CommonMark syntax MAY be used for rich text representation. |
| `server` | `mojo.openapi.Server` |  | 否 |  | A server object to be used by the target operation. |
