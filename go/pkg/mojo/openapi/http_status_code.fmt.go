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

var HttpStatusCodeNames = map[int32]string{
	0: "default",
	1: "code_200",
}

var HttpStatusCodeValues = map[string]HttpStatusCode{
	"default":  HttpStatusCode_HTTP_STATUS_CODE_DEFAULT,
	"code_200": HttpStatusCode_HTTP_STATUS_CODE_CODE_200,
}

func (x HttpStatusCode) Format() string {
	s, ok := HttpStatusCodeNames[int32(x)]
	if ok {
		return s
	}
	if int(x) == 0 {
		return "unspecified"
	}
	return strconv.Itoa(int(x))
}

func (x HttpStatusCode) ToString() string {
	return x.Format()
}

func (x *HttpStatusCode) Parse(value string) error {
	if x != nil {
		s, ok := HttpStatusCodeValues[value]
		if ok {
			*x = s
		} else {
			*x = HttpStatusCode_HTTP_STATUS_CODE_DEFAULT
		}
	} else {
		*x = HttpStatusCode_HTTP_STATUS_CODE_DEFAULT
	}
	return nil
}
