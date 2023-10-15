func searchRange(nums []int, target int) []int {
    l, r, lVal, rVal, mid := 0, len(nums)-1, len(nums), -1, 0
    
    for l <= r {
        mid = (l + r) / 2
        
        if nums[mid] == target { lVal = min(lVal, mid) }
        
        if nums[mid] >= target {
            r = mid - 1
        } else { l = mid + 1 }
    }
    
    if lVal == len(nums) { return []int{-1, -1} }
    
    l = lVal
    r = len(nums) - 1
    
    for l <= r {
        mid = (l + r) / 2
        
        if nums[mid] == target { rVal = max(rVal, mid) }
        
        if nums[mid] <= target {
            l = mid + 1
        } else { r = mid - 1 }
    }
    
    return []int{lVal, rVal}
}

func min(a, b int) int {
    if a > b { return b }
    return a
}

func max(a, b int) int {
    if a > b { return a }
    return b
}