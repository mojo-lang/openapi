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
	"fmt"
	"strconv"
	"strings"

	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

var ParameterLocationNames = map[int32]string{
	0: "unspecified",
	1: "path",
	2: "query",
	3: "header",
	4: "cookie",
}

var ParameterLocationValues = map[string]Parameter_Location{
	"unspecified": Parameter_LOCATION_UNSPECIFIED,
	"path":        Parameter_LOCATION_PATH,
	"query":       Parameter_LOCATION_QUERY,
	"header":      Parameter_LOCATION_HEADER,
	"cookie":      Parameter_LOCATION_COOKIE,
}

func (x Parameter_Location) Format() string {
	v := int32(x)
	if s, ok := ParameterLocationNames[v]; ok {
		if v == 0 && "unspecified" == strings.ToLower(s) {
			return ""
		}
		return s
	}
	if v == 0 {
		return ""
	}
	return strconv.Itoa(int(v))
}

func (x Parameter_Location) ToString() string {
	return x.Format()
}

func (x *Parameter_Location) Parse(value string) error {
	if x != nil && len(value) > 0 {
		if s, ok := ParameterLocationValues[value]; ok {
			*x = s
		} else {
			v := core.CaseStyler("snake")(value)
			if s, ok = ParameterLocationValues[v]; ok {
				*x = s
			} else {
				return fmt.Errorf("invalid Parameter_Location: %s", value)
			}
		}
	}
	return nil
}

func ParseParameter_Location(value string) (Parameter_Location, error) {
	var v Parameter_Location
	if err := (&v).Parse(value); err != nil {
		return v, err
	}
	return v, nil
}
