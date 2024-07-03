func minDifference(nums []int) int {
    if len(nums) < 5 { return 0 }
        
    sort.Ints(nums)

    n := len(nums)
    ret := 99999999999

    for i := 0; i < 4; i++ { ret = min(ret, nums[n-4+i] - nums[i]) }

    return ret
}

func min(a, b int) int {
    if a < b { return a }
    return b
}