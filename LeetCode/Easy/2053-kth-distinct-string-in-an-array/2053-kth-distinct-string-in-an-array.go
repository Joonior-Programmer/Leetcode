func kthDistinct(arr []string, k int) string {
    count := make(map[string]int)
           
    for _, v := range arr {
        if _, ok := count[v]; ok {
            count[v]++
        } else { count[v] = 1 }
    }

    for _, v := range arr {
        if count[v] == 1 {
            k--
            if k == 0 { return v }
        }
    }

    return ""
}