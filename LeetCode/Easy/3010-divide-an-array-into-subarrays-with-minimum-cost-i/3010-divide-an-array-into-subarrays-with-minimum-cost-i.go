func minimumCost(nums []int) int {
    ret := nums[0]
    first := 999
    second := 999

    for i := 1; i < len(nums); i++ {
        if nums[i] < first {
            second = first
            first = nums[i]
        } else if nums[i] < second { second = nums[i] }
    }

    return ret + first + second
}