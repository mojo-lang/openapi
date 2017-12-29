/// A metadata object that allows for more fine-tuned XML model definitions.
///
/// When using arrays, XML element names are not inferred (for singular/plural forms) and the name property SHOULD be used to add that information. See examples for expected behavior.
type Xml {
    /// Replaces the name of the element/attribute used for the described schema property. When defined within items, it will affect the name of the individual XML elements within the list. When defined alongside type being array (outside the items), it will affect the wrapping element and only if wrapped is true. If wrapped is false, it will be ignored.
    name: String @1

    /// The URI of the namespace definition. Value MUST be in the form of an absolute URI.
    namespace: Url @2

    /// The prefix to be used for the name.
    prefix: String @3

    /// Declares whether the property definition translates to an attribute instead of an element.
    attribute: Bool @10 = false

    /// MAY be used only for an array definition. Signifies whether the array is wrapped (for example, `<books><book/><book/></books>`) or unwrapped (<book/><book/>). Default value is false. The definition takes effect only when defined alongside type being array (outside the items).
    wrapped: Bool @11 = false
}
