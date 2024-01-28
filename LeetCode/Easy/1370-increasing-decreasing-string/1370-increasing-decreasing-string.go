func sortString(s string) string {
    count := make([]int, 26)
    var ret bytes.Buffer
    i := 0
    l, r := 0, 25

    for _, v := range s {
        count[v-97]++
    }

    for i < len(s) {
        for l < r && count[l] == 0 {
            l++
        }

        ret.WriteByte(byte(l+97))
        i++
        count[l]--

        for j := l + 1; j < r + 1; j++ {
            if count[j] != 0 {
                count[j]--
                ret.WriteByte(byte(j+97))
                i++
            }
        }

        if i == len(s) {
            break
        }

        for r > l && count[r] == 0 {
            r--
        }

        ret.WriteByte(byte(r+97))
        i++
        count[r]--

        for j := r - 1; j > l - 1; j-- {
            if count[j] != 0 {
                count[j]--
                ret.WriteByte(byte(j+97))
                i++
            }
        }
    }

    return ret.String();
}