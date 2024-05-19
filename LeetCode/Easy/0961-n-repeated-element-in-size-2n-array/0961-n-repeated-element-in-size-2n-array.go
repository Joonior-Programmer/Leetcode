func repeatedNTimes(nums []int) int {
    exist := make([]bool, 10001)

    for _, v := range nums{
        if exist[v] { return v }
        exist[v] = true
    }

    return -1
}