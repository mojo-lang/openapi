package openapi

import (
    "github.com/mojo-lang/core/go/pkg/logs"
    "github.com/mojo-lang/document/go/pkg/markdown"
    "github.com/mojo-lang/document/go/pkg/mojo/document"
)

func (x *CachedDocument) GetDocument() *document.Document {
    if x != nil {
        if x.Val != nil {
            return x.Val
        } else {
            md := markdown.New()
            doc, err := md.Parse(x.Cache)
            if err != nil {
                logs.Warnw("failed to parse markdown from document")
                return nil
            }
            x.Val = doc
            return doc
        }
    }
    return nil
}

func (x *CachedDocument) GetStringDocument() string {
    if x != nil {
        if x.Val != nil {
            md := markdown.New()
            str, err := md.RenderToString(x.Val)
            if err != nil {
                logs.Warnw("failed to render markdown to string document")
                return ""
            }
            x.Cache = str
            return str
        } else {
            return x.Cache
        }
    }
    return ""
}
