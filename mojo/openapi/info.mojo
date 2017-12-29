/// The object provides metadata about the API. The metadata MAY be used by the clients if needed, and MAY be presented in editing or documentation generation tools for convenience.
type Info {
    /// The title of the application.
    title: String @1 @required

    /// A short description of the application.
    /// CommonMark syntax syntax MAY be used for rich text representation.
    description: Cached<document.Document> @2

    /// A URL to the Terms of Service for the API.
    terms_of_service: Url @3

    /// The contact information for the exposed API.
    contact: Contact @4

    /// The license information for the exposed API.
    license: License @5

    /// Provides the version of the application API (not to be confused with the specification version)
    version: Version @6 @required
}
