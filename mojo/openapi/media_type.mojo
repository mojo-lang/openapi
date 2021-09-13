/// Each Media Type Object provides schema and examples for the media type identified by its key.
type MediaType {
    /// The schema defining the type used for the request body.
    schema: Referenceable<Schema> @1

    /// Example of the media type.
    /// The example object SHOULD be in the correct format as specified by the media type.
    /// The example object is mutually exclusive of the examples object.
    /// Furthermore, if referencing a schema which contains an example,
    /// the example value SHALL override the example provided by the schema.
    example: Any @2

    /// Examples of the media type.
    /// Each example object SHOULD match the media type and specified schema if present.
    /// The examples object is mutually exclusive of the example object.
    /// Furthermore, if referencing a schema which contains an example,
    /// the examples value SHALL override the example provided by the schema.
    examples: {String : Referenceable<Example>} @3

    /// A map between a property name and its encoding information.
    /// The key, being the property name, MUST exist in the schema as a property.
    /// The encoding object SHALL only apply to requestBody objects when the media type is multipart or application/x-www-form-urlencoded.
    encoding: {String : Encoding} @5
}