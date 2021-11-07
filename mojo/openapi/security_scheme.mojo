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

/// Defines a security scheme that can be used by the operations. Supported schemes are HTTP authentication, an API key (either as a header or as a query parameter), OAuth2's common flows (implicit, password, application and access code) as defined in RFC6749, and OpenID Connect Discovery.
type SecurityScheme {
    enum Type {
        api_key @1
        http    @2
        oauth2  @3
        open_id_connect @4
    }

    /// The type of the security scheme. 
    type: Type @1 @required

    /// A short description for security scheme. CommonMark syntax MAY be used for rich text representation.
    description: Cached<document.Document> @2

    //@skip(type != Type.api_key) {
        /// The name of the header, query or cookie parameter to be used.
        name: String @5 @required

        /// The location of the API key. Valid values are "query", "header" or "cookie".
        in: String @6 @required
    //}
    
    //@skip(type != Type.http) {
        /// The name of the HTTP Authorization scheme to be used in the Authorization header as defined in RFC7235.
        scheme: String @10 @required

        /// A hint to the client to identify how the bearer token is formatted. Bearer tokens are usually generated by an authorization server, so this information is primarily for documentation purposes.
        bearer_format: String @11
    //}

    /// An object containing configuration information for the flow types supported.
    flows: OAuthFlows @15 @required //@skip(type != Type.oauth2)

    /// OpenId Connect URL to discover OAuth2 configuration values. This MUST be in the form of a URL.
    open_id_connect_url: Url @20 @required //@skip(type != Type.open_id_connect)
}