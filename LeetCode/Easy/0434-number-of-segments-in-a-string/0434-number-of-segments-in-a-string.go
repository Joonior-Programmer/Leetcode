func countSegments(s string) int {
    empty := true
    ret := 0
    for i := 0; i < len(s); i++ {
        if s[i] == ' ' && !empty {
            empty = true
            ret++
        } else if s[i] != ' ' { empty = false }
    }
    
    if !empty { ret++ }
    return ret
}