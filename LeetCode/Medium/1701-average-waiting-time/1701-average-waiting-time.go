func averageWaitingTime(customers [][]int) float64 {
    ret := 0
    curr := 0

    for _, v := range customers {
        curr = max(curr, v[0]) + v[1]
        ret += curr - v[0]
    }

    return float64(ret) / float64(len(customers))
}

func max(a, b int) int {
    if a > b { return a }
    return b
}