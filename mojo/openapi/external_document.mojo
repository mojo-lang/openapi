/// Allows referencing an external resource for extended documentation.
type ExternalDocument {
    /// A short description of the target documentation.
    description: Cached<document.Document> @1

    /// The URL for the target documentation.
    url: Url @2
}