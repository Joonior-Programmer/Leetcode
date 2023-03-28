func isSubsequence(s string, t string) bool {
    j := 0
    
    for i, _ := range t {
        if j < len(s) && s[j] == t[i] {j++}
    }
    
    if j == len(s) { return true }
    return false
}