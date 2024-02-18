func maximizeSum(nums []int, k int) int {
    ret := 0
    curr := 0

    for i := 0; i < len(nums); i++ { curr = max(curr, nums[i]) }

    for k > 0 {
        ret += curr
        curr++
        k--
    }

    return ret
}