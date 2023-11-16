func freqAlphabets(s string) string {
    var ret bytes.Buffer
    i := 0
    n := len(s)
    for i < n {
        if i + 2 < n && s[i+2] == '#' {
            ret.WriteByte(byte(96 + (s[i] - 48) * 10 + s[i+1] - 48))
            i += 3
        } else {
            ret.WriteByte(byte(96 + s[i] - 48))
            i++
        }
    }

    return ret.String()
}