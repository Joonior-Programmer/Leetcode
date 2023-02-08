func isPalindrome(s string) bool {
    ret := ""
    for i := 0; i < len(s); i++{
        if s[i] >= 'a' && s[i] <= 'z' || s[i] >= '0' && s[i] <= '9'{
            ret += string(s[i])
        } else if s[i] >= 'A' && s[i] <= 'Z' {
            ret += string(s[i] - 65 + 97)
        }
    }
    for i, j := 0, len(ret) - 1; i < j; i,j = i+1, j-1 {
        if ret[i] != ret[j] {
            return false
        }
    }
    return true
}