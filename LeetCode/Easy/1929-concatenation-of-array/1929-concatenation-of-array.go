func getConcatenation(nums []int) []int {
    n := len(nums)
    ret := make([]int, n * 2)

    for i := 0; i < n; i++ {
        temp := nums[i]
        ret[i] = temp
        ret[n+i] = temp
    }

    return ret
}