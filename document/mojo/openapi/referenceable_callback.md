| type | format | description |
|---|---|---|
| `mojo.openapi.Reference` |  | A simple object to allow referencing other components in the specification, internally and externally. |
| `Map<string, mojo.openapi.PathItem>` |  | A map of possible out-of band callbacks related to the parent operation. Each value in the map is a Path Item Object that describes a set of requests that may be initiated by the API provider and the expected responses. The key value used to identify the callback object is an expression, evaluated at runtime, that identifies a URL to use for the callback operation. |
