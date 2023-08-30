func gameOfLife(board [][]int)  {
    rowLen := len(board)
    colLen := len(board[0])
    
    for r := 0; r < rowLen; r++ {
        for c := 0; c < colLen; c++ {
            ones := 0
            
            for row := max(0, r-1); row < min(rowLen, r + 2); row++ {
                for col := max(0, c-1); col < min(colLen, c + 2); col++ {
                    ones += board[row][col] & 1
                }
            }
            
            if board[r][c] == 1 && (ones == 3 || ones == 4) {
                board[r][c] = 3
            } else if board[r][c] == 0 && ones == 3 {
                board[r][c] = 2
            }
        }
    }
    
    for r := 0; r < rowLen; r++ {
        for c := 0; c < colLen; c++ {
            board[r][c] >>= 1
        }
    }
}


func min(a, b int) int {
    if a < b { return a }
    return b
}


func max(a, b int) int {
    if a > b { return a }
    return b
}