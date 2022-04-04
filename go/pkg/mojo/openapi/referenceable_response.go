package openapi

func NewReferenceableResponse(response *Response) *ReferenceableResponse {
    s := &ReferenceableResponse{}
    s.SetResponse(response)
    return s
}

func NewReferencedResponse(reference *Reference) *ReferenceableResponse {
    s := &ReferenceableResponse{}
    s.SetReference(reference)
    return s
}

func (x *ReferenceableResponse) SetResponse(response *Response) {
    if x != nil {
        x.ReferenceableResponse = &ReferenceableResponse_Response{
            Response: response,
        }
    }
}

func (x *ReferenceableResponse) SetReference(reference *Reference) {
    if x != nil {
        x.ReferenceableResponse = &ReferenceableResponse_Reference{
            Reference: reference,
        }
    }
}
