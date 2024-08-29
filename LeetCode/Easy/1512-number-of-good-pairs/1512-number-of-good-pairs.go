func numIdenticalPairs(nums []int) int {
    count := make([]int, 101)
    ret := 0

    for _, v := range nums { count[v]++ }

    for i := 1; i < 101; i++ {
        ret += count[i] * (count[i] - 1) / 2
    }

    return ret
}