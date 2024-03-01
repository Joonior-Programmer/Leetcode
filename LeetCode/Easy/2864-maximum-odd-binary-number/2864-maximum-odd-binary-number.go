func maximumOddBinaryNumber(s string) string {
    n := len(s)
    count := 0
    var ret bytes.Buffer

    for i := 0; i < n; i++ {
        if s[i] == '1' { count++ }
    }

    for i := 0; i < count - 1; i++ { ret.WriteRune('1') }
    for i := 0; i < n - count; i++ { ret.WriteRune('0') }
    ret.WriteRune('1')

    return ret.String()
}