func minPathSum(grid [][]int) int {
    colLen := len(grid[0])
    rowLen := len(grid)

    for row := 1; row < rowLen; row++ { grid[row][0] += grid[row-1][0] }
    for col := 1; col < colLen; col++ { grid[0][col] += grid[0][col-1] }

    for row := 1; row < rowLen; row++ {
        for col := 1; col < colLen; col++ {
            grid[row][col] += min(grid[row-1][col], grid[row][col-1]);
        }
    }
    
    return grid[rowLen-1][colLen-1];
}

func min(a, b int) int {
    if a < b { return a }
    return b
}