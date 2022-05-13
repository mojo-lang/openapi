package openapi

import (
    "github.com/mojo-lang/core/go/pkg/mojo/core"
    "strings"
)

const (
    urlExprType        = "$url"
    methodExprType     = "$method"
    statusCodeExprType = "$statusCode"
    requestExprPrefix  = "$request."
    responseExprPrefix = "$response."

    sourceHeaderPrefix = "header."
    sourceQueryPrefix  = "query."
    sourcePathPrefix   = "path."
    sourceBodyPrefix   = "body"
)

func (x *Expression) Format() string {
    if x != nil {
        builder := new(strings.Builder)
        builder.WriteString("$")
        builder.WriteString(x.Type.Format())
        if x.Source != nil {
            builder.WriteByte('.')
            builder.WriteString(x.Source.Location.Format())
            if len(x.Source.Name) > 0 {
                builder.WriteByte('.')
                builder.WriteString(x.Source.Name)
            } else if len(x.Source.Path) > 0 {
                builder.WriteByte('#')
                builder.WriteString(x.Source.Path)
            }
        }
        return builder.String()
    }
    return ""
}

func (x *Expression) ToString() string {
    return x.Format()
}

func (x *Expression_Source) Parse(value string) error {
    if x != nil {
        if len(value) >= 4 {
            switch value[0:4] {
            case "head":
                if strings.HasPrefix(value, sourceHeaderPrefix) {
                    x.Location = Expression_LOCATION_HEADER
                    x.Name = value[len(sourceHeaderPrefix):]
                } else {
                    return core.NewMalformedSyntaxError("invalid expression source in header: %s", value)
                }
            case "quer":
                if strings.HasPrefix(value, sourceQueryPrefix) {
                    x.Location = Expression_LOCATION_QUERY
                    x.Name = value[len(sourceQueryPrefix):]
                } else {
                    return core.NewMalformedSyntaxError("invalid expression source in query: %s", value)
                }
            case "path":
                if strings.HasPrefix(value, sourcePathPrefix) {
                    x.Location = Expression_LOCATION_PATH
                    x.Name = value[len(sourcePathPrefix):]
                } else {
                    return core.NewMalformedSyntaxError("invalid expression source in path: %s", value)
                }
            case "body":
                if strings.HasPrefix(value, sourceBodyPrefix) {
                    x.Location = Expression_LOCATION_BODY
                    if len(value) > 4 {
                        x.Path = value[len(sourcePathPrefix):]
                    }
                } else {
                    return core.NewMalformedSyntaxError("invalid expression source in path: %s", value)
                }
            default:
                return core.NewMalformedSyntaxError("invalid expression source: %s", value)
            }
            return nil
        }
        return core.NewMalformedSyntaxError("invalid expression source: %s", value)
    }
    return nil
}

func ParseExpressionSource(value string) (*Expression_Source, error) {
    v := &Expression_Source{}
    if err := v.Parse(value); err != nil {
        return v, err
    }
    return v, nil
}

func (x *Expression) Parse(value string) error {
    if x != nil {
        if len(value) >= 4 {
            switch value[0:4] {
            case urlExprType:
                x.Type = Expression_TYPE_URL
            case "$met":
                if value == methodExprType {
                    x.Type = Expression_TYPE_METHOD
                } else {
                    return core.NewMalformedSyntaxError("invalid expression method type: %s", value)
                }
            case "$sta":
                if value == statusCodeExprType {
                    x.Type = Expression_TYPE_STATUS_CODE
                } else {
                    return core.NewMalformedSyntaxError("invalid expression statusCode type: %s", value)
                }
            case "$req":
                if strings.HasPrefix(value, requestExprPrefix) {
                    source, err := ParseExpressionSource(value[len(requestExprPrefix):])
                    if err != nil {
                        return core.NewMalformedSyntaxError("invalid expression request source type: %s, error: %s", value, err.Error())
                    }
                    x.Type = Expression_TYPE_REQUEST
                    x.Source = source
                } else {
                    return core.NewMalformedSyntaxError("invalid expression request type: %s", value)
                }
            case "$res":
                if strings.HasPrefix(value, responseExprPrefix) {
                    source, err := ParseExpressionSource(value[len(responseExprPrefix):])
                    if err != nil {
                        return core.NewMalformedSyntaxError("invalid expression response source type: %s, error: %s", value, err.Error())
                    }
                    x.Type = Expression_TYPE_RESPONSE
                    x.Source = source
                } else {
                    return core.NewMalformedSyntaxError("invalid expression response type: %s", value)
                }
            default:
                return core.NewMalformedSyntaxError("invalid expression: %s", value)
            }
            return nil
        }
        return core.NewMalformedSyntaxError("invalid expression: %s", value)
    }
    return nil
}

func ParseExpression(value string) (*Expression, error) {
    v := &Expression{}
    if err := v.Parse(value); err != nil {
        return v, err
    }
    return v, nil
}
