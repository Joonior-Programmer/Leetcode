func merge(intervals [][]int) [][]int {
    sort.Slice(intervals, func(i, j int) bool {
        return intervals[i][0] < intervals[j][0]
    })
    ret := make([][]int, 0)
    var temp = []int{intervals[0][0], intervals[0][1]}
    
    for i := 1; i < len(intervals); i++ {
        if temp[1] >= intervals[i][0] {
            temp[1] = max(temp[1], intervals[i][1])
        } else {
            ret = append(ret, temp)
            temp = intervals[i]
        }
    }
    
    ret = append(ret, temp)
    
    return ret
}

func max(a, b int) int {
    if a > b { return a }
    return b
}