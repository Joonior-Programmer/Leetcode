func arraySign(nums []int) int {
    var ret float64 = 1
    for i := 0; i < len(nums); i++ {
        ret *= float64(nums[i])
    }
    if ret > 0 {return 1}
    if ret < 0 {return -1}
    return 0
}