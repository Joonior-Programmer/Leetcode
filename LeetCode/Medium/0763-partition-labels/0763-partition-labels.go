func partitionLabels(s string) []int {
    idxs := make([]int, 26)

    for i := 0; i < len(s); i++ { idxs[s[i]-97] = i }

    ret := []int{}
    end, size := 0, 0

    for i := 0; i < len(s); i++ {
        size++
        end = max(end, idxs[s[i]-97])

        if i == end { 
            ret = append(ret, size)
            size = 0
        }
    }

    return ret
}

func max(a, b int) int {
    if a > b { return a }
    return b
}