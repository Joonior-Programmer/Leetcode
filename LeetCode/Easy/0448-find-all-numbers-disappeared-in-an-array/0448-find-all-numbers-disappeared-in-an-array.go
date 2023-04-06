func findDisappearedNumbers(nums []int) []int {
    exist := make([]bool, len(nums) + 1)
    ret := make([]int, 0)
    for i := 0; i < len(nums); i++ {exist[nums[i]] = true}
    for i := 1; i < len(nums)+1; i++ {
        if !exist[i] {ret = append(ret, i)}
    }
    return ret
}