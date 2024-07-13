func intersection(nums [][]int) []int {
    ret := make([]int, 0)
    n := len(nums)
    count := make([]int, 1001)

    for _, num := range nums {
        for _, v := range num { count[v]++ } 
    }

    for i := 1; i < 1001; i++ {
        if count[i] == n { ret = append(ret, i) }
    }

    return ret
}