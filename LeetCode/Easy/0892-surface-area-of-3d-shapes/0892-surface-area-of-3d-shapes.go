func surfaceArea(grid [][]int) int {
    if len(grid) == 1 { return grid[0][0] * 4 + 2 }
        
    n := len(grid)
        
    ret := 0
    temp := grid[0][0]
    if temp != 0 { ret += temp * 4 + 2 }

    for i := 1; i < n; i++ {
        temp = grid[0][i]
        if temp != 0 { ret += temp * 4 + 2 - min(temp, grid[0][i-1]) * 2 }
        
        temp = grid[i][0]
        if temp != 0 { ret += temp * 4 + 2 - min(temp, grid[i-1][0]) * 2 }
    }

    for i := 1; i < n; i++ {
        for j := 1; j < n; j++ {
            temp = grid[i][j]
            if temp != 0 {
                ret += temp * 4 + 2 - 
                    (min(temp, grid[i-1][j]) + 
                        min(temp, grid[i][j-1])) * 2
            }
        }
    }
    
    return ret;
}

    
func min(a, b int) int {
    if a < b { return a }
    return b
}