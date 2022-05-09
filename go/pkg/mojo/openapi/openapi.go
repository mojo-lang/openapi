package openapi

import (
    "github.com/mojo-lang/core/go/pkg/mojo/core"
    "reflect"
    "strings"
)

func New() *OpenAPI {
    return &OpenAPI{
        Openapi: &core.Version{
            Major: 3,
            Minor: 0,
            Patch: 3,
        },
        Info:       &Info{},
        Paths:      &Paths{Vals: map[string]*PathItem{}},
        Components: &Components{Schemas: map[string]*Schema{}},
    }
}

func (x *OpenAPI) GetOperation(id string) (path string, method string, operation *Operation, err error) {
    if x != nil && x.Paths != nil {
        for k, v := range x.Paths.Vals {
            for _, method = range []string{"Get", "Put", "Post", "Delete", "Options", "Head", "Patch", "Trace"} {
                ok := false
                if operation, ok = reflect.ValueOf(v).Elem().FieldByName(method).Interface().(*Operation); ok && operation.OperationId == id {
                    path = k
                    method = strings.ToUpper(method)
                    return
                }
            }
        }
    }
    return "", "", nil, core.NewNotFoundError("id: %s", id)
}
