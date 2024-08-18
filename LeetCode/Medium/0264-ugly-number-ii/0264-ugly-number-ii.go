func nthUglyNumber(n int) int {
    dp := make([]int, n)
    dp[0] = 1

    p2, p3, p5 := 0, 0, 0

    for i := 1; i < n; i++ {
        p2Val := dp[p2] * 2
        p3Val := dp[p3] * 3
        p5Val := dp[p5] * 5

        target := min(p2Val, p3Val, p5Val)
        dp[i] = target

        if target == p2Val { p2++ }
        if target == p3Val { p3++ } 
        if target == p5Val { p5++ }
    }

    return dp[n-1]
}

func min(a, b, c int) int {
    if a < b && a < c { return a }
    if b < c { return b }
    return c
}