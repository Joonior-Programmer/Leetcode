func missingNumber(nums []int) int {
    n := (len(nums) + 1) * len(nums) / 2
    for _, num := range nums { n -= num}
    return n
}