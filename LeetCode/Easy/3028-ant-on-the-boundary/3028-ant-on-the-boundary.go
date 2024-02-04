func returnToBoundaryCount(nums []int) int {
    curr := 0
    ret := 0

    for i := 0; i < len(nums); i++ {
        curr += nums[i]
        if curr == 0 { ret++ }
    }

    return ret
}