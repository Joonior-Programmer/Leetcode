func mostPoints(questions [][]int) int64 {
    n := len(questions)
    dp := make([]int64, n+1)

    for i := n - 1; i > -1; i-- {
        point := int64(questions[i][0])
        bp := questions[i][1]

        dp[i] = max(dp[i+1], dp[min(n, bp + i + 1)] + point)
    }

    return dp[0]
}

func min(a, b int) int {
    if a < b { return a }
    return b
}

func max(a, b int64) int64 {
    if a > b { return a }
    return b
}