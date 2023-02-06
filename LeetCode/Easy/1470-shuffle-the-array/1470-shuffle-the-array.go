func shuffle(nums []int, n int) []int {
    ret := make([]int, n*2)
    for i := 0; i < n; i++ {
        ret[i*2] = nums[i]
        ret[i*2+1] = nums[n+i]
    }
    return ret
}