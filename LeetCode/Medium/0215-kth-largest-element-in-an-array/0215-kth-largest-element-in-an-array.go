func findKthLargest(nums []int, k int) int {
    count := make([]int, 20001)
    ret := 0
    
    for i := 0; i < len(nums); i++ { count[nums[i] + 10000]++ }
    
    for i := 20000; i > -1; i-- {
        if count[i] >= k {
            ret = i - 10000
            break
        } else { k -= count[i] }
    }
    
    return ret
}