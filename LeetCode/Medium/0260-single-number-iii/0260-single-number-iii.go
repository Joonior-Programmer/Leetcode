func singleNumber(nums []int) []int {
    n := len(nums)
    mask := 0
    
    for i := 0; i < n; i++ { mask ^= nums[i] }

    mask &= -mask

    ret := make([]int, 2)

    for _, v := range nums {
        if (mask & v) == 0 { 
            ret[0] ^= v 
        } else { ret[1] ^= v }
    }
    
    return ret
}