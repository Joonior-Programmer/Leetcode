func getMaximumGold(grid [][]int) int {
    rowLen := len(grid) - 1
    colLen := len(grid[0]) - 1
    visited := make([][]bool, rowLen + 1)
    ret := 0
    
    for i := 0; i < rowLen + 1; i++ { visited[i] = make([]bool, colLen + 1)}

    dfs := func(row, col, curr int) int { return 0 }
    dfs = func(row, col, curr int) int {
        if grid[row][col] == 0 || visited[row][col] { return curr }

        curr += grid[row][col]
        temp := curr
        visited[row][col] = true

        if row > 0 { temp = max(temp, dfs(row-1, col, curr)) }
        if row < rowLen { temp = max(temp, dfs(row+1, col, curr)) }
        if col > 0 { temp = max(temp, dfs(row, col-1, curr)) }
        if col < colLen { temp = max(temp, dfs(row, col+1, curr)) }

        curr = temp

        visited[row][col] = false

        return curr
    }

    for i := 0; i < rowLen + 1; i++ {
        for j := 0; j < colLen + 1; j++ {
            ret = max(ret, dfs(i,j,0))
        }
    }

    return ret;
}

func max(a, b int) int {
    if a > b { return a }
    return b
}