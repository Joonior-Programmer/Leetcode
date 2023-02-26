func containsDuplicate(nums []int) bool {
    contains := make(map [int]bool)
    for i := 0; i < len(nums); i++ {
        if contains[nums[i]] { return true }
        contains[nums[i]] = true
    }
    return false
}