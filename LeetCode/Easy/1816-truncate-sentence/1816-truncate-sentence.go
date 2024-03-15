func truncateSentence(s string, k int) string {
    n := len(s)
    i := 0

    for i < n {
        if s[i] == ' ' {
            k--
            if k == 0 {
                break
            }
        }
        i++
    }

    return s[:i]
}