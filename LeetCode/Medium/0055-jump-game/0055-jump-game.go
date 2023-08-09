func canJump(nums []int) bool {
    n := len(nums)
    maxPosition := nums[0]
    
    for i := 1; i < n; i++ {
        if maxPosition < i { return false }
        maxPosition = max(maxPosition, i + nums[i])
        if maxPosition >= n { return true }
    }
    
    return true
}

func max(a, b int) int {
    if a > b { return a }
    return b
}