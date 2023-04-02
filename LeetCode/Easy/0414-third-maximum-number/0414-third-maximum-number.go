func thirdMax(nums []int) int {
    first := math.MinInt
    second := math.MinInt
    third := math.MinInt
    for i := 0; i < len(nums); i++ {
        if nums[i] > first {
            third = second
            second = first
            first = nums[i]
        } else if nums[i] > second && nums[i] != first {
            third = second
            second = nums[i]
        } else if nums[i] > third && nums[i] != first && nums[i] != second {
            third = nums[i]
        }
    }
    if third == math.MinInt { return int(first) }
    return int(third)
}