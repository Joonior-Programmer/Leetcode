func longestPalindrome(s string) int {
    counter := make([]int, 58)
    ret := 0
    for i := 0; i < len(s); i++ {counter[s[i]-65]++}
    
    for i := 0; i < 58; i++ {
        ret += counter[i] / 2 * 2
        if ret % 2 == 0 && counter[i] % 2 == 1 {ret++}
    }
    return ret
}