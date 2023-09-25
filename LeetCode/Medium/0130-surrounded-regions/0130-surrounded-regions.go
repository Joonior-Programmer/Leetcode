func solve(board [][]byte)  {
    rowLen := len(board)
    colLen := len(board[0])
    
    dfs := func(row, col int){}
    dfs = func(row, col int){
        if row < 0 || row == rowLen || col < 0 || col == colLen || board[row][col] != 'O' { return }
        
        board[row][col] = 'T'
        
        dfs(row - 1, col)
        dfs(row + 1, col)
        dfs(row, col - 1)
        dfs(row, col + 1)
    }
    
    for i := 0; i < rowLen; i++ {
        if board[i][0] == 'O' { dfs(i, 0) }
        if board[i][colLen - 1] == 'O' { dfs(i, colLen - 1) }
    }
    
    for i := 1; i < colLen - 1; i++ {
        if board[0][i] == 'O' { dfs(0, i) }
        if board[rowLen - 1][i] == 'O' { dfs(rowLen - 1, i) }
    }
    
    for row := 0; row < rowLen; row++ {
        for col := 0; col < colLen; col++ {
            if board[row][col] == 'T' {
                board[row][col] = 'O'
            } else if board[row][col] == 'O' {
                board[row][col] = 'X'
            }
        }
    }
}