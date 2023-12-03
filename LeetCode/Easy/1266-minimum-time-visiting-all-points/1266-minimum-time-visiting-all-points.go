func minTimeToVisitAllPoints(points [][]int) int {
    ret := 0
    
    for i := 1; i < len(points); i++ {
        ret += max(abs(points[i][0] - points[i-1][0]), abs(points[i][1] - points[i-1][1]))
    }
    
    return ret
}

func max(a, b int) int {
    if a > b { return a }
    return b
}

func abs(a int) int {
    if a < 0 { return a * -1 }
    return a
}