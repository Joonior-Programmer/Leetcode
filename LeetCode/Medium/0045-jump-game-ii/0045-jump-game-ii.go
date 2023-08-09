func jump(nums []int) int {
    n := len(nums) - 1
    nextMax := 0
    maxPosition := 0
    ret := 0
    i := 0

    for i < n && maxPosition < n {
        for i <= maxPosition {
            nextMax = max(nextMax, i + nums[i])
            i++
        }
        ret++
        maxPosition = nextMax
    }
    
    return ret
}

func max(a, b int) int {
    if a > b { return a }
    return b
}