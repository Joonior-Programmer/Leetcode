func change(amount int, coins []int) int {
    dp := make([]int, amount + 1)
    dp[0] = 1
    
    for i := len(coins) - 1; i > -1; i-- {
        for j := coins[i]; j < amount + 1; j++ {
            dp[j] += dp[j - coins[i]]
        }
    }
    
    return dp[amount]
}