type Pair struct {
    row int
    col int
}

func orangesRotting(grid [][]int) int {
    ret := 0
    rotten := 0 
    fresh := 0
    q := make([]Pair, 0)
    rowLen := len(grid) - 1
    colLen := len(grid[0]) - 1
    
    for i := 0; i < rowLen + 1; i++ {
        for j := 0; j < colLen + 1; j++ {
            if grid[i][j] == 2 {
                rotten++
                q = append(q, Pair{i, j})
            } else if grid[i][j] == 1 { fresh++ }
        } 
    }
    
    total := fresh + rotten
    
    if rotten == total { return 0 }
    
    for len(q) > 0 {
        tempQ := make([]Pair, 0)
        for i := 0; i < len(q); i++ {
            row := q[i].row
            col := q[i].col
            
            if row > 0 && grid[row-1][col] == 1 {
                rotten++
                tempQ = append(tempQ, Pair{row-1, col})
                grid[row-1][col] = 2
            }
            
            if row < rowLen && grid[row+1][col] == 1 {
                rotten++
                tempQ = append(tempQ, Pair{row+1, col})
                grid[row+1][col] = 2
            }
            
            if col > 0 && grid[row][col-1] == 1 {
                rotten++
                tempQ = append(tempQ, Pair{row, col-1})
                grid[row][col-1] = 2
            }
            
            if col < colLen && grid[row][col+1] == 1 {
                rotten++
                tempQ = append(tempQ, Pair{row, col+1})
                grid[row][col+1] = 2
            }
        }
        
        ret++
        if rotten == total { return ret }
        q = tempQ
        
    }
    
    return -1
    
}
