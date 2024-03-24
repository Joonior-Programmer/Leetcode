func findDuplicate(nums []int) int {
    n := len(nums)
    exist := make([]bool, n)

    for i := 0; i < n; i++ {
        if exist[nums[i]] {
            return nums[i]
        } else { exist[nums[i]] = true }
    }

    return -1
}