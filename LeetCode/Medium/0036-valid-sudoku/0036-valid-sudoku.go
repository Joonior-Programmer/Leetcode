func isValidSudoku(board [][]byte) bool {
    row := make([][]int, 9)
    col := make([][]int, 9)
    box := make([][]int, 9)
    
    for i := 0; i < 9; i++ {
        row[i] = make([]int, 9)
        col[i] = make([]int, 9)
        box[i] = make([]int, 9)
    }
    
    for r := 0; r < 9; r++ {
        for c := 0; c < 9; c++ {
            v := int(board[r][c]) - 49
            
            if v < 0 { continue }
            
            boxNum := c / 3 + 3 * (r / 3)
            
            if row[r][v] > 0 || col[c][v] > 0 || box[boxNum][v] > 0 { return false }
            
            row[r][v]++
            col[c][v]++
            box[boxNum][v]++
        }
    }
    
    return true
}