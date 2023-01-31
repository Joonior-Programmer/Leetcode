func singleNumber(nums []int) int {
    ret := nums[0]
    for i := 1; i < len(nums); i++ {
        ret ^= nums[i]
    }
    return ret
}