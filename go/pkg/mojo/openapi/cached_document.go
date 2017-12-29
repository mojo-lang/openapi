package openapi

import (
	"github.com/mojo-lang/core/go/pkg/logs"
	"github.com/mojo-lang/document/go/pkg/markdown"
	"github.com/mojo-lang/document/go/pkg/mojo/document"
)

func (m *CachedDocument) GetDocument() *document.Document {
	if m != nil {
		if m.Value != nil {
			return m.Value
		} else {
			md := markdown.New()
			doc, err := md.Parse(m.Cache)
			if err != nil {
				logs.Warnw("failed to parse markdown from document")
				return nil
			}
			m.Value = doc
			return doc
		}
	}
	return nil
}

func (m *CachedDocument) GetStringDocument() string {
	if m != nil {
		if m.Value != nil {
			md := markdown.New()
			str, err := md.RenderToString(m.Value)
			if err != nil {
				logs.Warnw("failed to render markdown to string document")
				return ""
			}
			m.Cache = str
			return str
		} else {
			return m.Cache
		}
	}
	return ""
}
