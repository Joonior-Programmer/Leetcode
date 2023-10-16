func findMin(nums []int) int {
    if len(nums) < 3 { 
        if nums[0] <= nums[len(nums) - 1] { return nums[0] }
        return nums[1]
    }
    
    l := 0
    r := len(nums) - 1
    mid := 0
    ret := nums[0]
    
    for l <= r {
        mid = (l + r) / 2
        
        if nums[mid] > ret { 
            l = mid + 1
        } else {
            r = mid - 1
            ret = nums[mid]
        }
    }
    
    return ret
}