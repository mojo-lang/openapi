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

func (m *ReferenceableResponse) SetResponse(response *Response) {
	if m != nil {
		m.ReferenceableResponse = &ReferenceableResponse_Response{
			Response: response,
		}
	}
}

func (m *ReferenceableResponse) SetReference(reference *Reference) {
	if m != nil {
		m.ReferenceableResponse = &ReferenceableResponse_Reference{
			Reference: reference,
		}
	}
}