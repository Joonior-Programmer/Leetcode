func onesMinusZeros(grid [][]int) [][]int {
    rowLen := len(grid)
    colLen := len(grid[0])
    oneRows := make([]int, rowLen)
    oneCols := make([]int, colLen)

    for row := 0; row < rowLen; row++ {
        temp := 0
        for col := 0; col < colLen; col++ {
            temp += grid[row][col]
        }

        oneRows[row] = temp * 2 - rowLen
    }

    for col := 0; col < colLen; col++ {
        temp := 0
        for row := 0; row < rowLen; row++ {
            temp += grid[row][col]
        }

        oneCols[col] = temp * 2 - colLen
    }

    for row := 0; row < rowLen; row++ {
        for col := 0; col < colLen; col++ {
            grid[row][col] = oneRows[row] + oneCols[col];
        }
    }

    return grid
}