func minFallingPathSum(grid [][]int) int {
    rowLen := len(grid)
    colLen := len(grid[0])

    if colLen == 1 { return grid[0][0] }

    for row := rowLen - 1; row > 0; row--{
        first := 999999999
        second := 999999999
        idx := 0
        for col := 0; col < colLen; col++ {
            temp := grid[row][col]
            if temp < first{
                idx = col
                second = first
                first = temp
            } else if temp < second { second = temp }
        }

        for col := 0; col < colLen; col++ {
            if idx == col {
                grid[row-1][col] += second
            } else { grid[row-1][col] += first }
        }
    }

    ret := 999999999

    for i := 0; i < colLen; i++ { ret = min(ret, grid[0][i]) }

    return ret
}

func min(a, b int) int {
    if a < b { return a }
    return b
}