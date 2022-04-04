package openapi

func (x *Operation) GetLocationParameters() map[Parameter_Location][]*Parameter {
    ps := make(map[Parameter_Location][]*Parameter)
    parameters := x.GetParameters()
    for _, parameter := range parameters {
        p := parameter.GetParameter()
        if p != nil {
            ps[p.In] = append(ps[p.In], p)
        }
    }
    return ps
}
