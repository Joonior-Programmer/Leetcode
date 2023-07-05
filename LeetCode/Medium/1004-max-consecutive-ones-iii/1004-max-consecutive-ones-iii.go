func longestOnes(nums []int, k int) int {
    ret := 0
    l := 0
    r := 0
    n := len(nums)
    
    for r < n {
        for r < n && k > 0 {
            if nums[r] == 0 { k-- }
            r++
        }
        
        for r < n && nums[r] == 1 { r++ }
        
        if r - l > ret { ret = r - l }
        
        for l < n && nums[l] == 1 { l++ }
        l++
        k++
    }
    
    return ret
}