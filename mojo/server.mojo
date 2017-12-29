/// An object representing a Server.
type Server {
    /// A URL to the target host.
    /// This URL supports Server Variables and MAY be relative, to indicate that the host location is relative to the location where the OpenAPI document is being served.
    /// Variable substitutions will be made when a variable is named in {brackets}.
    url : Uri @required

    /// An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text representation.
    description: String 

    /// A map between a variable name and its value.
    /// The value is used for substitution in the server's URL template.
    variables : {String, ServerVariable}
}