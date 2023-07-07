func longestSubarray(nums []int) int {
    ret := 0
    i := 0
    zeroCount := 0
    
    for j := 0; j < len(nums); j++ {
        if nums[j] == 0 { zeroCount++ }
        for zeroCount > 1 {
            if nums[i] == 0 { zeroCount-- }
            i++
        }
        if j - i > ret { ret = j - i }
    }
    
    return ret
}