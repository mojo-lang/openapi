| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `schemas` | `Map<string, mojo.openapi.Schema>` |  | 否 |  | An object to hold reusable Schema Objects. |
| `responses` | `Map<string, mojo.openapi.Response>` |  | 否 |  | An object to hold reusable Response Objects. |
| `parameters` | `Map<string, mojo.openapi.Parameter>` |  | 否 |  | An object to hold reusable Parameter Objects. |
| `examples` | `Map<string, mojo.openapi.Example>` |  | 否 |  | An object to hold reusable Example Objects. |
| `requestBodies` | `Map<string, mojo.openapi.RequestBody>` |  | 否 |  | An object to hold reusable Request Body Objects. |
| `headers` | `Map<string, mojo.openapi.Header>` |  | 否 |  | An object to hold reusable Header Objects. |
| `securitySchemes` | `Map<string, mojo.openapi.SecurityScheme>` |  | 否 |  | An object to hold reusable Security Scheme Objects. |
| `links` | `Map<string, mojo.openapi.Link>` |  | 否 |  | An object to hold reusable Link Objects. |
| `callbacks` | `Map<string, Map<string, mojo.openapi.PathItem>>` |  | 否 |  | An object to hold reusable Callback Objects. |
| `pathItems` | `Map<string, mojo.openapi.PathItem>` |  | 否 |  | An object to hold reusable Path Item Object. |
