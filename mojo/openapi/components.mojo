/// Holds a set of reusable objects for different aspects of the OAS. All objects defined within the components object will have no effect on the API unless they are explicitly referenced from properties outside the components object.
type Components {
    type Key = String @template

    /// An object to hold reusable Schema Objects.
    schemas: {Key: Schema} @1

    /// An object to hold reusable Response Objects.
    responses: {Key: Referenceable<Response>} @2

    /// An object to hold reusable Parameter Objects.
    parameters: {Key: Referenceable<Parameter>} @3

    /// An object to hold reusable Example Objects.
    examples: {Key: Referenceable<Example>} @4

    /// An object to hold reusable Request Body Objects.
    request_bodies: {Key: Referenceable<RequestBody>} @5

    /// An object to hold reusable Header Objects.
    headers: {Key: Referenceable<Header>} @6

    /// An object to hold reusable Security Scheme Objects.
    security_schemes: {Key: Referenceable<SecurityScheme>} @7

    /// An object to hold reusable Link Objects.
    links: {Key: Referenceable<Link>} @8

    /// An object to hold reusable Callback Objects.
    callbacks: {Key: Referenceable<Callback>} @9

    /// An object to hold reusable Path Item Object.
    path_items: {Key: Referenceable<PathItem>} @10
}
