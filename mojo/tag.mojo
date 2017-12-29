/// Allows adding meta data to a single tag that is used by the Operation Object.
/// It is not mandatory to have a Tag Object per tag used there.
type Tag {
    /// The name of the tag.
    name: String @required

    /// A short description for the tag.
    description: doc.Document

    /// Additional external documentation for this tag.
    external_docs: ExternalDocument
}