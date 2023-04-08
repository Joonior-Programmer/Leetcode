func repeatedSubstringPattern(s string) bool {
    length := len(s)
    for i := length / 2; i > 0; i-- {
        if length % i == 0 && s[i-1] == s[length-1] {
            if strings.Repeat(s[0:i], length / i) == s { return true }
        }
    }
    return false
}