func countSubIslands(grid1 [][]int, grid2 [][]int) int {
    ret := 0
    row_len := len(grid1) - 1
    col_len := len(grid1[0]) - 1

    dfs := func(row, col int) bool { return true }
    dfs = func(row, col int) bool { 
        if grid1[row][col] == 0 && grid2[row][col] == 1 { return false }

        if grid2[row][col] == 0 {
            grid2[row][col] = 0
            return true
        }

        grid2[row][col] = 0

        l,r,u,d := true, true, true, true

        if row < row_len { r = dfs(row + 1, col) }
        if row > 0 { l = dfs(row - 1, col) }
        if col < col_len { u = dfs(row, col + 1) }
        if col > 0 { d = dfs(row, col - 1) }

        return l && r && u && d
    }

    for r := 0; r < row_len + 1; r++ {
        for c := 0; c < col_len + 1; c++ {
            if grid2[r][c] == 1 {
                if dfs(r, c) { ret++ }
            }
        }
    }

    return ret
}