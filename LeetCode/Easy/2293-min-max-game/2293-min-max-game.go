func minMaxGame(nums []int) int {
    if len(nums) == 1 { return nums[0] }

    temp := make([]int, len(nums) / 2)

    for i := 0; i < len(nums) / 2; i++ {
        if i % 2 == 0 {
            temp[i] = min(nums[i * 2], nums[i * 2 + 1])
        } else { temp[i] = max(nums[i * 2], nums[i * 2 + 1]) }
    }

    return minMaxGame(temp)
}

func min(a, b int) int {
    if a < b { return a }
    return b
}

func max(a, b int) int {
    if a > b { return a }
    return b
}