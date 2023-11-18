func longestPalindrome(s string) string {
    n := len(s)
    retL := 0
    retR := 0
    
    for i := 0; i < n; i++ {
        l, r := i, i + 2
        
        for l > -1 && r < n && s[l] == s[r] {
            if r - l > retR - retL {
                retR = r
                retL = l
            }
            l--
            r++
        }
        
        l, r = i, i + 1
        
        for l > -1 && r < n && s[l] == s[r] {
            if r - l > retR - retL {
                retR = r
                retL = l
            }
            l--
            r++
        }
    }
    
    return s[retL:retR+1]
}