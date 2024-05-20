func subsetXORSum(nums []int) int {
    n := len(nums)
    ret := 0
    
    for _, v := range nums { ret |= v }
    
    return ret * (1 << (n - 1))
}