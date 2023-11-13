func minimumTotal(triangle [][]int) int {
    for i := len(triangle) - 2; i > -1; i-- {
        for j := 0; j < i + 1; j++ {
            triangle[i][j] = min(triangle[i][j] + triangle[i+1][j], triangle[i][j] + triangle[i+1][j+1])
        }
    }
    
    return triangle[0][0]
}

func min(a, b int) int {
    if a < b { return a }
    return b
}