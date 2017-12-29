package openapi

func (m *Schema) IsPropertyRequired(property string) bool {
	if m != nil {
		for _, r := range m.Required {
			if r == property {
				return true
			}
		}
	}
	return false
}

func (m *Schema) GetTypeName(index map[string]*Schema) string {
	if m != nil {
		switch m.Type {
		case Schema_TYPE_ARRAY:
			return "Array<" + m.Items.GetTypeName(index) + ">"
		case Schema_TYPE_OBJECT:
			return m.Title
		default:
			return m.Type.Format()
		}
	}
	return ""
}
