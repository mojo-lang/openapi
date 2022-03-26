package openapi

func NewReferenceableParameter(parameter *Parameter) *ReferenceableParameter {
    s := &ReferenceableParameter{}
    s.SetParameter(parameter)
    return s
}

func NewReferencedParameter(reference *Reference) *ReferenceableParameter {
    s := &ReferenceableParameter{}
    s.SetReference(reference)
    return s
}

func (m *ReferenceableParameter) SetParameter(parameter *Parameter) {
    if m != nil {
        m.ReferenceableParameter = &ReferenceableParameter_Parameter{
            Parameter: parameter,
        }
    }
}

func (m *ReferenceableParameter) SetReference(reference *Reference) {
    if m != nil {
        m.ReferenceableParameter = &ReferenceableParameter_Reference{
            Reference: reference,
        }
    }
}
