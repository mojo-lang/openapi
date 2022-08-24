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

func (x *OpenAPI) GetPath(name string) *PathItem {
    if x != nil && x.Paths != nil && x.Paths.Vals != nil {
        if pi, ok := x.Paths.Vals[name]; ok {
            return pi
        }
    }
    return nil
}

// CheckVersion check the version is "3.0", or "3.1"
func (x *OpenAPI) CheckVersion(version string) bool {
    if x != nil && x.Openapi != nil {
        v, err := core.ParseVersion(version)
        if err != nil {
            return false
        }

        if v.Level > 0 && v.Major != x.Openapi.Major {
            return false
        }
        if v.Level > 1 && v.Minor != x.Openapi.Minor {
            return false
        }
        if v.Level > 2 && v.Patch != x.Openapi.Patch {
            return false
        }

        return true
    }
    return false
}

func (x *OpenAPI) GetOperation(id string) (path string, method string, operation *Operation, err error) {
    if x != nil && x.Paths != nil {
        for k, v := range x.Paths.Vals {
            for _, method = range []string{"Get", "Put", "Post", "Delete", "Options", "Head", "Patch", "Trace"} {
                ok := false
                op := reflect.ValueOf(v).Elem().FieldByName(method)
                if !op.IsNil() {
                    if operation, ok = op.Interface().(*Operation); ok && operation.OperationId == id {
                        path = k
                        method = strings.ToUpper(method)
                        return
                    }
                }
            }
        }
    }
    return "", "", nil, core.NewNotFoundError("id: %s", id)
}

func (x *OpenAPI) GenerateExample() {
    if x != nil && x.Paths != nil {
        for _, path := range x.Paths.Vals {
            path.GenerateExample(x.Components)
        }
    }
}

func (x *OpenAPI) SupplementExample() {
    if x != nil && x.Paths != nil {
        for _, path := range x.Paths.Vals {
            path.SupplementExample(x.Components)
        }
    }
}
