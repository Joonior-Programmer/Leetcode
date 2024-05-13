func matrixScore(grid [][]int) int {
    rowLen := len(grid)
    colLen := len(grid[0])
    ret := 0

    for _, row := range grid {
        if row[0] == 0 {
            row[0] = 1
            for col := 1; col < colLen; col++ {
                if row[col] == 0 {
                    row[col] = 1
                } else { row[col] = 0 }
            }
        }
    }

    for col := 0; col < colLen; col++ {
        count := 0
        for row := 0; row < rowLen; row++ {
            if grid[row][col] == 0 { count++ } 
        }
        
        if count > rowLen / 2 {
            for row := 0; row < rowLen; row++ {
                if grid[row][col] == 0 {
                    grid[row][col] = 1
                } else { grid[row][col] = 0 }
            }
        }
    }
    
    for _, row := range grid {
        temp := 0
        for _, v := range row { temp = temp * 2 + v }

        ret += temp
    }

    return ret
}