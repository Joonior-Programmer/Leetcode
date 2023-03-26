func firstUniqChar(s string) int {
    ret := make([]int, 26)
    for _, v := range s {
        ret[v-'a']++
    }

    for i := 0; i < len(s); i++ {
        if ret[s[i] - 97] == 1 {
            return i
        }
    }

    return -1
}