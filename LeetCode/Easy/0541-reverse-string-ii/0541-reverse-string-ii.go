func reverseStr(s string, k int) string {
    ret := ""
    i := 0
    for i < len(s) {
        if i + k < len(s) {
            ret += reverse(s[i:i+k])
        } else {
            ret += reverse(s[i:len(s)])
        }
        if i + k > len(s) {break}
        if i + k + k < len(s) {
            ret += s[i+k:i+k+k]
        } else {
            ret += s[i+k:len(s)]
        }
        i += k * 2
    }
    return ret
}

func reverse(s string) string {
    ret := []rune(s)
    for i, j := 0, len(s)-1; i < j; i, j = i + 1, j - 1 {
        ret[i], ret[j] = ret[j], ret[i]
    }
    return string(ret)
}