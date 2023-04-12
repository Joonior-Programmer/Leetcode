func licenseKeyFormatting(s string, k int) string {
    s = strings.ToUpper(s)
    temp := k
    ret := make([]byte, 0)
    for i := len(s) - 1; i > -1; i-- {
        if s[i] != '-' {
            if temp == 0 {
                ret = append(ret, '-')
                temp = k
            }
            ret = append(ret, s[i])
            temp--
        }
    }

    for i, j := 0, len(ret) - 1; i < j; i, j = i + 1, j - 1 {
        ret[i], ret[j] = ret[j], ret[i]
    }
    return string(ret)
}