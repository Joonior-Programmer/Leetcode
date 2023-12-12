func maxProduct(nums []int) int {
    first := 0
    second := 0
        
    for i := 0; i < len(nums); i++ {
        if nums[i] >= first {
            second = first
            first = nums[i]
        } else if nums[i] >= second { second = nums[i] }
    }

    return (first - 1) * (second - 1)
}