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