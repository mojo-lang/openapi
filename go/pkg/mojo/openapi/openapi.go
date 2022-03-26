package openapi

import "github.com/mojo-lang/core/go/pkg/mojo/core"

func NewOpenApi() *OpenAPI {
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
