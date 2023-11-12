func getMaximumGenerated(n int) int {
    ret := 0
    dp := make([]int, n+2)
    dp[1] = 1
    
    for i := 0; i < n / 2 + 1; i++ {
        dp[2*i] = dp[i]
        dp[2*i+1] = dp[i] + dp[i+1]
    }
    
    for i := 0; i < n+1; i++ { ret = max(ret, dp[i]) }
    
    return ret
    
}

func max(a, b int) int {
    if a > b { return a }
    return b
}