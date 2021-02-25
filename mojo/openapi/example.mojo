type Example {
    /// Short description for the example.
    summary: String

    /// Long description for the example.
    description: String

    /// Embedded literal example.
    /// The value field and externalValue field are mutually exclusive.
    /// To represent examples of media types that cannot naturally represented in JSON or YAML,
    /// use a string value to contain the example, escaping where necessary.
    value: Any

    /// A URL that points to the literal example.
    /// This provides the capability to reference examples that cannot easily be included in JSON or YAML documents.
    /// The value field and externalValue field are mutually exclusive.
    external_value: Url
}