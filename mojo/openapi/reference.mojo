/// A simple object to allow referencing other components in the specification, internally and externally.
///
/// The Reference Object is defined by JSON Reference and follows the same structure, behavior and rules.
///
/// For this specification, reference resolution is accomplished as defined by the JSON Reference specification and not by the JSON Schema specification.
type Reference {
    /// The reference Url string.
    ref: Url @1 @alias("$ref") @required

    /// A short summary which by default SHOULD override that of the referenced component. If the referenced object-type does not allow a summary field, then this field has no effect.
    summary: String @2

    /// A description which by default SHOULD override that of the referenced component. CommonMark syntax MAY be used for rich text representation. If the referenced object-type does not allow a description field, then this field has no effect.
    description: Cached<document.Document> @3
}

@label_format('{}')
type Referenceable<T> = Reference @1 | T @2