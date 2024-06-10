func findLengthOfLCIS(nums []int) int {
    ret := 1
    currVal := nums[0]
    curr := 1

    for i := 1; i < len(nums); i++ {
        if nums[i] > currVal{
            currVal = nums[i]
            curr++
        } else {
            ret = max(curr, ret);
            curr = 1
            currVal = nums[i]
        }
    }

    return max(ret, curr)
}

func max(a, b int) int {
    if a > b { return a }
    return b
}