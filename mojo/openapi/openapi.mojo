type OpenAPI {
    /// This string MUST be the semantic version number of the OpenAPI Specification version that the OpenAPI document uses. The openapi field SHOULD be used by tooling specifications and clients to interpret the OpenAPI document. This is not related to the API info.version string.
    openapi: Version @required @default('3.0.1')

    /// Provides metadata about the API. The metadata MAY be used by tooling if needed.
    info: Info @required

    /// An array of Server Objects, which provide connectivity information to a target server.
    /// If the servers property is not provided, or is an empty array,
    /// the default value would be a Server Object with a url value of /.
    servers: [Server]

    /// The available paths and operations for the API.
    ///
    /// Holds the relative paths to the individual endpoints and their operations.
    /// The path is appended to the URL from the Server Object in order to construct the full URL.
    /// The Paths MAY be empty, due to ACL constraints.
    paths: Paths @required

    /// An element to hold various schemas for the specification.
    components: Components

    /// A declaration of which security mechanisms can be used across the API. The list of values includes alternative security requirement objects that can be used. Only one of the security requirement objects need to be satisfied to authorize a request. Individual operations can override this definition.
    security: SecurityRequirement

    /// A list of tags used by the specification with additional metadata. The order of the tags can be used to reflect on their order by the parsing tools. Not all tags that are used by the Operation Object must be declared. The tags that are not declared MAY be organized randomly or based on the tools' logic. Each tag name in the list MUST be unique.
    tags: [Tag]

    /// Additional external documentation.
    external_docs : ExternalDocument
}

/// `OpenAPI` construct from `Package`
///
/// ```
/// OpenAPI(package).to<Yaml>
/// ```
//OpenAPI(Package: lang.Package)