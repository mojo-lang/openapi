/// An object representing a Server.
//@example({
//    "url": "https://development.gigantic-server.com/v1",
//    "description": "Development server"
//})
type Server {
    /// A URL to the target host.
    /// This URL supports Server Variables and MAY be relative, to indicate that the host location is relative to the location where the OpenAPI document is being served.
    /// Variable substitutions will be made when a variable is named in {brackets}.
    url : Url @1 @required

    /// An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text representation.
    description: Cached<document.Document> @3

    /// A map between a variable name and its value.
    /// The value is used for substitution in the server's URL template.
    variables : {String: ServerVariable} @4
}