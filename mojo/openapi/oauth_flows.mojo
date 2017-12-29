/// Allows configuration of the supported OAuth Flows.
type OAuthFlows {
    /// Configuration for the OAuth Implicit flow
    implicit: OAuthFlow  @1 @skip_fields('token_url')

    /// Configuration for the OAuth Resource Owner Password flow
    password: OAuthFlow  @2 @skip_fields('authorization_url')

    /// Configuration for the OAuth Client Credentials flow.
    client_credentials: OAuthFlow @3 @skip_fields('authorization_url')

    /// Configuration for the OAuth Authorization Code flow.
    authorization_code: OAuthFlow @4
}