func islandPerimeter(grid [][]int) int {
    ret := 0
    for row := 0; row < len(grid); row++ {
        for col := 0; col < len(grid[0]); col++ {
            if grid[row][col] == 0 {continue}
            ret += 4
            if row > 0 && grid[row - 1][col] == 1 {ret -= 2}
            if col > 0 && grid[row][col - 1] == 1 {ret -= 2}
        }
    }
    return ret
}