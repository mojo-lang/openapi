
/// Contact information for the exposed API.
type Contact {
    /// The identifying name of the contact person/organization.
    name: String @1

    /// The URL pointing to the contact information.
    url: Url @2

    /// The email address of the contact person/organization.
    email: EmailAddress @3
}