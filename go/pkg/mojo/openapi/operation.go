package openapi

func (m *Operation) GetLocationParameters() map[Parameter_Location][]*Parameter {
	ps := make(map[Parameter_Location][]*Parameter)
	parameters := m.GetParameters()
	for _, parameter := range parameters {
		p := parameter.GetParameter()
		if p != nil {
			ps[p.In] = append(ps[p.In], p)
		}
	}
	return ps
}
