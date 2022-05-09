// Code generated by mojo. DO NOT EDIT.
// Rerunning mojo will overwrite this file.
//
// Copyright 2021 Mojo-lang.org
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package openapi

import (
	"strconv"
)

var SecuritySchemeTypeNames = map[int32]string{
	1: "api_key",
	2: "http",
	3: "oauth2",
	4: "open_id_connect",
}

var SecuritySchemeTypeValues = map[string]SecurityScheme_Type{
	"api_key":         SecurityScheme_TYPE_API_KEY,
	"http":            SecurityScheme_TYPE_HTTP,
	"oauth2":          SecurityScheme_TYPE_OAUTH2,
	"open_id_connect": SecurityScheme_TYPE_OPEN_ID_CONNECT,
}

func (x SecurityScheme_Type) Format() string {
	s, ok := SecuritySchemeTypeNames[int32(x)]
	if ok {
		return s
	}
	if int(x) == 0 {
		return "unspecified"
	}
	return strconv.Itoa(int(x))
}

func (x SecurityScheme_Type) ToString() string {
	return x.Format()
}

func (x *SecurityScheme_Type) Parse(value string) error {
	if x != nil {
		s, ok := SecuritySchemeTypeValues[value]
		if ok {
			*x = s
		} else {
			*x = SecurityScheme_TYPE_API_KEY
		}
	} else {
		*x = SecurityScheme_TYPE_API_KEY
	}
	return nil
}

func ParseSecurityScheme_Type(value string) (SecurityScheme_Type, error) {
	var v SecurityScheme_Type
	if err := (&v).Parse(value); err != nil {
		return v, err
	}
	return v, nil
}
