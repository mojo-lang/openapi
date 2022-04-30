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

var ParameterLocationNames = map[int32]string{
	1: "path",
	2: "query",
	3: "header",
	4: "cookie",
}

var ParameterLocationValues = map[string]Parameter_Location{
	"path":   Parameter_LOCATION_PATH,
	"query":  Parameter_LOCATION_QUERY,
	"header": Parameter_LOCATION_HEADER,
	"cookie": Parameter_LOCATION_COOKIE,
}

func (x Parameter_Location) Format() string {
	s, ok := ParameterLocationNames[int32(x)]
	if ok {
		return s
	}
	if int(x) == 0 {
		return "unspecified"
	}
	return strconv.Itoa(int(x))
}

func (x Parameter_Location) ToString() string {
	return x.Format()
}

func (x *Parameter_Location) Parse(value string) error {
	if x != nil {
		s, ok := ParameterLocationValues[value]
		if ok {
			*x = s
		} else {
			*x = Parameter_LOCATION_PATH
		}
	} else {
		*x = Parameter_LOCATION_PATH
	}
	return nil
}
