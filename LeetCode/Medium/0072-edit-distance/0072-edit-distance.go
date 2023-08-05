func minDistance(word1 string, word2 string) int {
    n := len(word1)
    m := len(word2)
    dp := make([][]int, m+1)
    
    for i := 0; i < m+1; i++ { dp[i] = make([]int, n+1) }
    for i := 0; i < m; i++ { dp[i][n] = m - i }
    for i := 0; i < n; i++ { dp[m][i] = n - i }
    
    for i := m - 1; i > -1; i-- {
        for j := n - 1; j > -1; j-- {
            if word1[j] == word2[i] {
                dp[i][j] = dp[i+1][j+1]
            } else {
                dp[i][j] = 1 + min(dp[i+1][j], min(dp[i+1][j+1], dp[i][j+1]))
            }
        }
    }
    
    return dp[0][0]
}

func min(a,b int) int {
    if a < b { return a }
    return b
}