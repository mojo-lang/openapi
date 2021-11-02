package openapi

import (
	"sort"
	"strings"
)

func (m *PathItem) SetOperation(name string, operation *Operation) {
	switch strings.ToLower(name) {
	case "get":
		m.Get = operation
	case "post":
		m.Post = operation
	case "put":
		m.Put = operation
	case "patch":
		m.Patch = operation
	case "delete":
		m.Delete = operation
	case "options":
		m.Options = operation
	case "head":
		m.Head = operation
	case "trace":
		m.Trace = operation
	}
}

func (m *PathItem) Merge(item *PathItem) *PathItem {
	if m == nil {
		return item
	}

	if len(item.Ref) > 0 {
		m.Ref = item.Ref
	}
	if len(item.Summary) > 0 {
		m.Summary = item.Summary
	}
	if item.Description != nil {
		m.Description = item.Description
	}
	if item.Get != nil {
		m.Get = item.Get
	}
	if item.Put != nil {
		m.Put = item.Put
	}
	if item.Post != nil {
		m.Post = item.Post
	}
	if item.Delete != nil {
		m.Delete = item.Delete
	}
	if item.Options != nil {
		m.Options = item.Options
	}
	if item.Head != nil {
		m.Head = item.Head
	}
	if item.Patch != nil {
		m.Patch = item.Patch
	}
	if item.Trace != nil {
		m.Trace = item.Trace
	}
	if len(item.Servers) > 0 {
		m.Servers = append(m.Servers, item.Servers...)
	}
	if len(item.Parameters) > 0 {
		m.Parameters = append(m.Parameters, item.Parameters...)
	}
	return m
}

func OrderedPathItemIterator(m map[string]*PathItem, onKey func(key string, value *PathItem) error) error {
	var list []struct {
		key   string
		value *PathItem
	}
	for k, v := range m {
		list = append(list, struct {
			key   string
			value *PathItem
		}{
			key:   k,
			value: v,
		})
	}
	sort.SliceStable(list, func(i, j int) bool {
		return list[i].key < list[j].key
	})
	for _, el := range list {
		err := onKey(el.key, el.value)
		if err != nil {
			return err
		}
	}
	return nil
}
