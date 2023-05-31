func increasingTriplet(nums []int) bool {
    first := 2147483647
    second := 2147483647
    for i := 0; i < len(nums); i++ {
        if nums[i] <= first {
            first = nums[i]
        } else if nums[i] <= second {
            second = nums[i]
        } else {
            return true
        }
    }
    return false
}