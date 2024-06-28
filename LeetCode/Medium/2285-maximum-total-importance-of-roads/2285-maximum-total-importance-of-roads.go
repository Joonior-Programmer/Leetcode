func maximumImportance(n int, roads [][]int) int64 {
    count := make([]int, n)
    order := make([]int, n+1)
    var ret int64 = 0
    idx := n
    val := n

    for _, v := range roads {
        count[v[0]]++
        count[v[1]]++
    }

    for _, v := range count { order[v]++ }

    for idx > 0 {
        for idx > 0 && order[idx] < 1 { idx-- }
        if idx == 0 { break }
        order[idx]--
        ret += int64(idx * val)
        val--
    }

    return ret
}