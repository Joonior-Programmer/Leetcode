func runningSum(nums []int) []int {
    n := len(nums)
    ret := make([]int, n)
    curr := 0

    for i := 0; i < n; i++ {
        curr += nums[i]
        ret[i] = curr
    }

    return ret
}