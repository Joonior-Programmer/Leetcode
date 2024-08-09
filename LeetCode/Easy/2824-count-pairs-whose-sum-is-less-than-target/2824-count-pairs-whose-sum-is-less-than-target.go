func countPairs(nums []int, target int) int {
    n := len(nums)
    ret := 0

    for i := 0; i < n; i++ {
        temp := nums[i]

        for j := i + 1; j < n; j++ {
            if temp + nums[j] < target { ret++ }
        }
    }

    return ret
}