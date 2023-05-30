func productExceptSelf(nums []int) []int {
    ret := make([]int, len(nums))
    zeros := 0
    all_product := 1
    
    for i := 0; i < len(nums); i++ {
        if nums[i] == 0 { 
            zeros++ 
        } else {
            all_product *= nums[i]
        }
    }
    
    if zeros > 1 { return ret }
    
    for i := 0; i < len(nums); i++ {
        if nums[i] == 0 {
            ret[i] = all_product
        } else if (zeros == 0) {
            ret[i] = all_product / nums[i]
        }
    }
    
    return ret
}