func longestPalindromeSubseq(s string) int {
    n := len(s)
    dp := make([][]int, n+1)
    s1 := reverse(s)
    
    
    for i := 0; i <= n; i++ {
        dp[i] = make([]int, n+1)
    }
    
    for i := n - 1; i > -1; i-- {
        for j := n - 1; j > -1; j-- {
            if s[i] == s1[j] {
                dp[i][j] += 1 + dp[i+1][j+1]
            } else {
                dp[i][j] += max(dp[i+1][j], dp[i][j+1])
            }
        }
    }
    
    return dp[0][0]
}

func reverse(s string) string {
    ret := make([]byte, len(s))
    i := len(s) - 1
    
    for j := 0; j < len(s); j++ {
        ret[j] = s[i]
        i--
    }
    
    return string(ret)
}

func max(a, b int) int {
    if a > b { return a }
    return b
}