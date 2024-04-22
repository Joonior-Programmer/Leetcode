func scoreOfString(s string) int {
    ret := 0
    
    for i := 1; i < len(s); i++ {
        ret += abs(int(s[i]) - int(s[i-1]))
    }
    
    return ret
}

func abs(v int) int {
    if v < 0 { return -v }
    return v
}