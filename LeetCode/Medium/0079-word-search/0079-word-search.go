func exist(board [][]byte, word string) bool {
    rowLen := len(board)-1
    colLen := len(board[0])-1
    n := len(word)
    
    dfs := func(row, col, idx int) bool { return false }
    dfs = func(row, col, idx int) bool { 
        idx++
        if idx == n { return true }
        
        temp := board[row][col]
        board[row][col] = '?'
        
        if row > 0 && board[row-1][col] == word[idx] && dfs(row-1, col, idx) { return true }
        if row < rowLen && board[row+1][col] == word[idx] && dfs(row+1, col, idx) { return true }
        if col > 0 && board[row][col-1] == word[idx] && dfs(row, col-1, idx) { return true }
        if col < colLen && board[row][col+1] == word[idx] && dfs(row, col+1, idx) { return true }
        
        board[row][col] = temp
        
        return false 
    }
    
    for row := 0; row < rowLen + 1; row++ {
        for col := 0; col < colLen + 1; col++ {
            if board[row][col] == word[0] && dfs(row, col, 0) { return true }
        }
    }
    
    return false
}