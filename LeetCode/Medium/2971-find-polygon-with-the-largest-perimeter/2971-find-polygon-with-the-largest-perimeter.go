func largestPerimeter(nums []int) int64 {
    n := len(nums)
    sum := 0

    for i := 0; i < n; i++ { sum += nums[i] }

    sort.Ints(nums)

    for i := n - 1; i > 1; i-- {
        if nums[i] < sum - nums[i] { return int64(sum) }
        sum -= nums[i]
    }

    return -1
}