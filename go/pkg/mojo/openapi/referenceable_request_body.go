package openapi

func NewReferenceableRequestBody(requestBody *RequestBody) *ReferenceableRequestBody {
	s := &ReferenceableRequestBody{}
	s.SetRequestBody(requestBody)
	return s
}

func NewReferencedRequestBody(reference *Reference) *ReferenceableRequestBody {
	s := &ReferenceableRequestBody{}
	s.SetReference(reference)
	return s
}

func (m *ReferenceableRequestBody) SetRequestBody(requestBody *RequestBody) {
	if m != nil {
		m.ReferenceableRequestBody = &ReferenceableRequestBody_RequestBody{
			RequestBody: requestBody,
		}
	}
}

func (m *ReferenceableRequestBody) SetReference(reference *Reference) {
	if m != nil {
		m.ReferenceableRequestBody = &ReferenceableRequestBody_Reference{
			Reference: reference,
		}
	}
}
