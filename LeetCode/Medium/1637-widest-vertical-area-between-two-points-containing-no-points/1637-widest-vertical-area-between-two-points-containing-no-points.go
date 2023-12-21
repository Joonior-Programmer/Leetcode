func maxWidthOfVerticalArea(points [][]int) int {
    x := make([]int, len(points))
    ret := 0
    
    for i := 0; i < len(x); i++ { x[i] = points[i][0] }
    
    sort.Ints(x)
    
    for i := 1; i < len(x); i++ { ret = max(ret, x[i] - x[i-1]) }
    
    return ret
}

func max (a, b int) int {
    if a > b { return a }
    return b
}