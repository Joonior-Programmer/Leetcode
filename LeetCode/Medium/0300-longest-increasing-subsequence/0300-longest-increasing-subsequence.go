func lengthOfLIS(nums []int) int {
    dp := make([]int, len(nums))
    ret := 0
    
    for i := len(nums) - 1; i > -1; i-- {
        for j := i + 1; j < len(nums); j++ {
            if nums[i] < nums[j] { dp[i] = max(dp[i], 1 + dp[j]) }
        }
    }
    
    for i := 0; i < len(nums); i++ { ret = max(ret, dp[i]) }
    
    return ret + 1
}

func max(a, b int) int {
    if a > b { return a }
    return b
}