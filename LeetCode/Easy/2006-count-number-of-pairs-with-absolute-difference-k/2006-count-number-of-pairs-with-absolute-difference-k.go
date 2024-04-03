func countKDifference(nums []int, k int) int {
    n := len(nums)
    count := make([]int, 101)
    ret := 0

    for i := 0; i < n; i++ { count[nums[i]]++ }

    for i := 1; i < 101 - k; i++ { ret += count[i] * count[i+k] }

    return ret
}