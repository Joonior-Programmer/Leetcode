func removeStars(s string) string {
    ret := make([]byte, len(s))
    i := 0
    
    for j := 0; j < len(s); j++ {
        if s[j] != '*' {
            ret[i] = s[j]
            i++
        } else if i > 0 { i-- }
    }
    
    return string(ret)[:i]
}