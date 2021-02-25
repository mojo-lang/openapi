/// The object provides metadata about the API. The metadata MAY be used by the clients if needed, and MAY be presented in editing or documentation generation tools for convenience.
type Info {
    /// The title of the application.
    title: String @required

    /// A short description of the application.
    /// CommonMark syntax syntax MAY be used for rich text representation.
    description: Cached<Document>

    /// A URL to the Terms of Service for the API.
    terms_of_service: Url

    /// The contact information for the exposed API.
    contact: Contact

    /// The license information for the exposed API.
    license: License

    /// Provides the version of the application API (not to be confused with the specification version)
    version: Version @required
}
