func defangIPaddr(address string) string {
    var ret bytes.Buffer
    
    for i := 0; i < len(address); i++ {
        if address[i] != '.' {
            ret.WriteByte(address[i])
        } else {
            ret.WriteString("[.]")
        }
    }
    
    return ret.String()
}