/// Holds a set of reusable objects for different aspects of the OAS. All objects defined within the components object will have no effect on the API unless they are explicitly referenced from properties outside the components object.
type Components {
    type Key : String @template(r'^[a-zA-Z0-9\.\-_]+$')

    /// An object to hold reusable Schema Objects.
    schemas: {Key, Schema | Reference}

    /// An object to hold reusable Response Objects.
    responses: {Key, Response | Reference}

    /// An object to hold reusable Parameter Objects.
    parameters: {Key, Parameter | Reference}

    /// An object to hold reusable Example Objects.
    examples: {Key, Example | Reference}

    /// An object to hold reusable Request Body Objects.
    request_bodies: {Key, RequestBody | Reference }

    /// An object to hold reusable Header Objects.
    headers: {Key, Header | Reference}

    /// An object to hold reusable Security Scheme Objects.
    security_schemes: {Key, SecurityScheme | Reference}

    /// An object to hold reusable Link Objects.
    links: {Key, Link | Reference}

    /// An object to hold reusable Callback Objects.
    callbacks: {Key, Callback | Reference}
}