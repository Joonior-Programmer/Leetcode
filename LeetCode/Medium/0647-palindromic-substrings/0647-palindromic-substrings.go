func countSubstrings(s string) int {
    n := len(s)
    ret := n

    for i := 0; i < n; i++ {
        l := i-1
        r := i+1

        for l > -1 && r < n {
            if s[l] == s[r] {
                ret++
            } else { break }
            l--
            r++
        }

        l = i
        r = i+1

        for l > -1 && r < n {
            if s[l] == s[r] {
                ret++
            } else { break }
            l--
            r++
        }
    }

    return ret
}