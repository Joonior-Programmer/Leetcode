func shiftGrid(grid [][]int, k int) [][]int {
    row_len := len(grid)
    col_len := len(grid[0])
    total := row_len * col_len
    vals := make([]int, total)

    i := 0

    for _, row := range grid {
        for _, v := range row{
            vals[i] = v
            i++
        }
    }

    i -= k;
    i = (i % total + total) % total;

    for row := 0; row < row_len; row++ {
        for col := 0; col < col_len; col++ {
            grid[row][col] = vals[i]
            i++
            
            if i >= total { i = 0 }
        }
    }

    return grid
}