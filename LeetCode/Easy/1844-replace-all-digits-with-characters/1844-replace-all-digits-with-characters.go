func replaceDigits(s string) string {
    n := len(s)
    ret := make([]byte, n)

    for i := 0; i < n; i++ {
        if s[i] < 97 {
            ret[i] = byte(s[i-1] + s[i] - '0')
        } else { ret[i] = s[i] }
    }

    return string(ret[:])
}