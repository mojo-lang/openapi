/// Describes a single request body.
type RequestBody {
    /// A brief description of the request body.
    /// This could contain examples of use. CommonMark syntax MAY be used for rich text representation.
    description: Cached<document.Document> @1

    /// The content of the request body.
    /// The key is a media type or media type range and the value describes it.
    /// For requests that match multiple keys, only the most specific key is applicable.
    /// e.g. text/plain overrides text/*
    content: {String: MediaType} @2 @required

    /// Determines if the request body is required in the request.
    required: Bool @3 @default(false)
}
