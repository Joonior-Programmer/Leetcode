func minOperations(nums []int) int {
    ret := 0
    i := 0
    sort.Ints(nums)
    
    for i < len(nums) {
        count := 1
        curr := nums[i]
        i++
        for i < len(nums) && nums[i] == curr {
            count++
            i++
        }
        
        if count == 1 { return -1 }
        
        ret += count / 3
        
        if count % 3 > 0 { ret++ }
    }
    
    return ret
}