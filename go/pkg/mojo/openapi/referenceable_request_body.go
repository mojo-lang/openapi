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

func (x *ReferenceableRequestBody) SetRequestBody(requestBody *RequestBody) {
    if x != nil {
        x.ReferenceableRequestBody = &ReferenceableRequestBody_RequestBody{
            RequestBody: requestBody,
        }
    }
}

func (x *ReferenceableRequestBody) SetReference(reference *Reference) {
    if x != nil {
        x.ReferenceableRequestBody = &ReferenceableRequestBody_Reference{
            Reference: reference,
        }
    }
}
