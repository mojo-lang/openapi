package openapi

import (
    "github.com/mojo-lang/core/go/pkg/mojo/core"
    "strings"
)

func NewComponents() *Components {
    return &Components{
        Schemas:         make(map[string]*Schema),
        Responses:       nil,
        Parameters:      nil,
        Examples:        nil,
        RequestBodies:   nil,
        Headers:         nil,
        SecuritySchemes: nil,
        Links:           nil,
        Callbacks:       nil,
        PathItems:       nil,
    }
}

func (m *Components) GetSchema(url *core.Url) *Schema {
    if m == nil {
        return nil
    }

    segments := strings.Split(url.GetFragment(), "/")
    if len(segments) > 2 && segments[0] == "components" && segments[1] == "schemas" {
        object := segments[len(segments)-1]
        return m.Schemas[object]
    }
    return nil
}
