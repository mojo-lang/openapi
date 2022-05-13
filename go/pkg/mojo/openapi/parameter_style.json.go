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
	"unsafe"

	jsoniter "github.com/json-iterator/go"
	"github.com/mojo-lang/core/go/pkg/mojo/core"
)

func init() {
	core.RegisterJSONTypeDecoder("openapi.Parameter_Style", &ParameterStyleCodec{})
	core.RegisterJSONTypeEncoder("openapi.Parameter_Style", &ParameterStyleCodec{})
}

type ParameterStyleCodec struct {
}

func (codec *ParameterStyleCodec) Decode(ptr unsafe.Pointer, iter *jsoniter.Iterator) {
	any := iter.ReadAny()
	e := (*Parameter_Style)(ptr)
	if any.ValueType() == jsoniter.StringValue {
		if err := e.Parse(any.ToString()); err != nil {
			iter.ReportError("ParameterStyleCodec.Decode", err.Error())
		}
	} else if any.ValueType() == jsoniter.NumberValue {
		value := any.ToInt32()
		if _, ok := ParameterStyleNames[value]; ok {
			*e = Parameter_Style(value)
		} else {
			iter.ReportError("ParameterStyleCodec.Decode", fmt.Sprintf("invalid enum value %d for Parameter_Style", value))
		}
	}
}

func (codec *ParameterStyleCodec) Encode(ptr unsafe.Pointer, stream *jsoniter.Stream) {
	e := (*Parameter_Style)(ptr)
	stream.WriteString(e.Format())
}

func (codec *ParameterStyleCodec) IsEmpty(ptr unsafe.Pointer) bool {
	e := (*Parameter_Style)(ptr)
	return e == nil || *e == 0
}
