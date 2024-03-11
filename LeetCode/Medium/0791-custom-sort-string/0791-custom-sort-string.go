func customSortString(order string, s string) string {
    n := len(s)
    count := make([]int, 26)
    i := 0
    ret := make([]byte, n)

    for j := 0; j < n; j++ { count[s[j] - 97]++ }

    for _, v := range order {
        for j := 0; j < count[v-97]; j++ { 
            ret[i] = byte(v)
            i++
        }
        count[v-97] = 0
    }

    for j := 0; j < 26; j++ {
        for k := 0; k < count[j]; k++ { 
            ret[i] = byte(j + 97)
            i++
        }
    }
    
    return string(ret)
}