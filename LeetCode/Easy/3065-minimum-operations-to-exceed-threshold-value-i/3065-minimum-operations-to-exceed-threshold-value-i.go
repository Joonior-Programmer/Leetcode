func minOperations(nums []int, k int) int {
    ret := 0
        
    for i := 0; i < len(nums); i++ {
        if nums[i] < k { ret++ }
    }

    return ret
}