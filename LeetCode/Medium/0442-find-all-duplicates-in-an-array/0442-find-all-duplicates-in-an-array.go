func findDuplicates(nums []int) []int {
    n := len(nums)
    ret := make([]int, 0)
    exist := make([]bool, n + 1)

    for _, v := range nums {
        if exist[v] {
            ret = append(ret, v)
        } else { exist[v] = true }
    }

    return ret
}