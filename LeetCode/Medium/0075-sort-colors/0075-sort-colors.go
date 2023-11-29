func sortColors(nums []int)  {
    count := make([]int, 3)
    idx := 0
    
    for i := 0; i < len(nums); i++ { count[nums[i]]++ }
    
    for i := 0; i < len(nums); i++ {
        for count[idx] == 0 { idx++ }
        
        nums[i] = idx
        count[idx]--
    }
}