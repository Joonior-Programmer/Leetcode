func reverseWords(s string) string {
    ret := []rune(s)
    j := 0
    for i := 1; i < len(s); i++ {
        if (ret[i] == ' '){
            for l, r := j, i - 1; l < r; l, r = l + 1 , r - 1 {
                ret[l], ret[r] = ret[r], ret[l]
            }
            j = i + 1
        }
    }
    for l, r := j, len(s) - 1; l < r; l, r = l + 1 , r - 1 {
        ret[l], ret[r] = ret[r], ret[l]
    }
    return string(ret)
}