func wordBreak(s string, wordDict []string) bool {
    n := len(s)
    dp := make([]bool, n + 1)
    dp[n] = true
    
    for i := n - 1; i > -1; i-- {
        for _, v := range wordDict {
            if i + len(v) <= n && s[i:i+len(v)] == v { dp[i] = dp[i+len(v)] }
            if dp[i] { break }
        }
    }
    
    return dp[0]
}