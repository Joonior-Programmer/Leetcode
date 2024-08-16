func buildArray(nums []int) []int {
    n := len(nums)
    ret := make([]int, n)

    for i := 0; i < n; i++ { ret[i] = nums[nums[i]] }

    return ret
}