func numIslands(grid [][]byte) int {
    ret := 0
    
    dfs := func(row, col int){}
    dfs = func(row, col int){
        grid[row][col] = 0
        
        if row > 0 && grid[row - 1][col] == '1' { dfs(row-1, col) }
        if row < len(grid) - 1 && grid[row + 1][col] == '1' { dfs(row+1, col) }
        if col > 0 && grid[row][col - 1] == '1' { dfs(row, col - 1) }
        if col < len(grid[0]) - 1 && grid[row][col + 1] == '1' { dfs(row, col + 1) }
    }
    
    for row := 0; row < len(grid); row++ {
        for col := 0; col < len(grid[0]); col++ {
            if grid[row][col] == '1' {
                ret++
                dfs(row, col)
            }
        }
    }
    
    return ret
}