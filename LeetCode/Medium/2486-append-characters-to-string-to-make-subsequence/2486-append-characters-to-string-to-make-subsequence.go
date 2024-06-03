func appendCharacters(s string, t string) int {
    n := len(s)
    m := len(t)
    j := 0

    for i := 0; i < n; i++ {
        if j == m { break }
        if s[i] == t[j] { j++ }
    }

    return m - j
}