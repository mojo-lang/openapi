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

/// License information for the exposed API.
///@example({
///    name: "Apache 2.0"
///    url: "http://www.apache.org/licenses/LICENSE-2.0.html"
///})
type License {
    /// The license name used for the API.
    name: String @1 @required

    /// A URL to the license used for the API.
    url: Url @5
}