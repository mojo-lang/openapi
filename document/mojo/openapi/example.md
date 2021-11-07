| 字段 | 类型 | 格式类型 | 是否必须 | 默认值 | 说明 |
|---|---|---|---|---|---|
| `externalValue` | `string` | `url` | 否 |  | A URL that points to the literal example.This provides the capability to reference examples that cannot easily be included in JSON or YAML documents.The value field and externalValue field are mutually exclusive. |
| `summary` | `string` | `` | 否 |  | Short description for the example. |
| `description` | `string` | `` | 否 |  | Long description for the example. |
| `value` | `mojo.core.Any` | `` | 否 |  | Embedded literal example.The value field and externalValue field are mutually exclusive.To represent examples of media types that cannot naturally represented in JSON or YAML,use a string value to contain the example, escaping where necessary. |
