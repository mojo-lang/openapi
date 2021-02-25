/// Configuration details for a supported OAuth Flow
type OAuthFlow {
    /// The authorization URL to be used for this flow
    authorization_url: Url @required

    /// The token URL to be used for this flow.
    token_url: Url @required

    /// The URL to be used for obtaining refresh tokens.
    refresh_url: Url

    /// The available scopes for the OAuth2 security scheme.
    /// A map between the scope name and a short description for it.
    scopes: {String: String} @required
}