func findJudge(n int, trust [][]int) int {
    isJudge := make([]bool, n+1)
    count := make([]int, n+1)

    for _, v := range trust {
        isJudge[v[0]] = true
        count[v[1]]++
    }

    for i := 1; i < n+1; i++ {
        if !isJudge[i] && count[i] == n - 1 { return i }
    }

    return -1
}