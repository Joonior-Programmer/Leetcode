func containsNearbyDuplicate(nums []int, k int) bool {
    find := make(map [int]int)
    for i := 0; i < len(nums); i++ {
        val, exist := find[nums[i]]
        if exist && i - val <= k {
            return true
        }
        find[nums[i]] = i
    }
    return false
}