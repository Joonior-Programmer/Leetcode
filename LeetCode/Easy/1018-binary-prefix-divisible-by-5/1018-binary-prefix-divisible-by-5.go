func prefixesDivBy5(nums []int) []bool {
    ret := make([]bool, len(nums))
    sum := 0
    
    for i := 0; i < len(nums); i++ {
        sum = (sum << 1 | nums[i]) % 5
        ret[i] = sum == 0
    }
    
    return ret
}