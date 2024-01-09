func heightChecker(heights []int) int {
    ret := 0
    compare := make([]int, len(heights))
    copy(compare, heights)
    sort.Ints(compare)
    
    for i := 0; i < len(heights); i++ {
        if heights[i] != compare[i] { ret++ }
    }
    
    return ret
}