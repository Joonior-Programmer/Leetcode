func isAnagram(s string, t string) bool {
    if len(s) != len(t) { return false }
    a := make([]int, 26)
    b := make([]int, 26)
    
    for i := 0; i < len(s); i++{
        a[s[i] - 'a']++
        b[t[i] - 'a']++
    }
    
    for i := 0; i < 26; i++ {
        if a[i] != b[i] { return false }
    }
    
    return true
}