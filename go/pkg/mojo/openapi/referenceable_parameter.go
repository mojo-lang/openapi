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

func (x *ReferenceableParameter) SetParameter(parameter *Parameter) {
    if x != nil {
        x.ReferenceableParameter = &ReferenceableParameter_Parameter{
            Parameter: parameter,
        }
    }
}

func (x *ReferenceableParameter) SetReference(reference *Reference) {
    if x != nil {
        x.ReferenceableParameter = &ReferenceableParameter_Reference{
            Reference: reference,
        }
    }
}
