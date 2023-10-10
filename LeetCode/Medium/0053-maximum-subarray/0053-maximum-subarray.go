func maxSubArray(nums []int) int {
    ret := -10001
    curr := 0
    
    for i := 0; i < len(nums); i++ {
        curr += nums[i]
        ret = max(ret, curr)
        curr = max(0, curr)
    }
    
    return ret
}

func max(a, b int) int {
    if a > b { return a }
    return b
}