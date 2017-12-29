/// An object representing a Server Variable for server URL template substitution.
type ServerVariable {
    /// An enumeration of string values to be used if the substitution options are from a limited set.
    enum : [String]

    /// The default value to use for substitution, and to send, if an alternate value is *not* supplied.
    /// Unlike the `Schema` Object's `default`, this value *MUST* be provided by the consumer.
    default: String @required

    /// An optional description for the server variable.
    /// CommonMark syntax MAY be used for rich text representation.
    description: String
}