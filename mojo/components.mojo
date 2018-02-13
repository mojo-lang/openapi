/// Holds a set of reusable objects for different aspects of the OAS. All objects defined within the components object will have no effect on the API unless they are explicitly referenced from properties outside the components object.
type Components {
    type Key : String @template

    /// An object to hold reusable Schema Objects.
    schemas:{Key: Schema | Reference} @1

    /// An object to hold reusable Response Objects.
    responses:{Key: Response | Reference} @2

    /// An object to hold reusable Parameter Objects.
    parameters:{Key: Parameter | Reference} @3

    /// An object to hold reusable Example Objects.
    examples:{Key: Example | Reference} @4

    /// An object to hold reusable Request Body Objects.
    request_bodies:{Key: RequestBody | Reference } @5

    /// An object to hold reusable Header Objects.
    headers:{Key: Header | Reference} @6

    /// An object to hold reusable Security Scheme Objects.
    security_schemes:{Key: SecurityScheme | Reference} @7

    /// An object to hold reusable Link Objects.
    links:{Key: Link | Reference} @8

    /// An object to hold reusable Callback Objects.
    callbacks:{Key: Callback | Reference} @9
}