class Solution {
    int rowLen;
    int colLen;
    public void solve(char[][] board) {
        rowLen = board.length;
        colLen = board[0].length;
        for (int i = 0; i < rowLen; ++i){
            if (board[i][0] == 'O') dfs(i, 0, board);
            if (board[i][colLen - 1] == 'O') dfs(i, colLen - 1, board);
        }
        
        for (int i = 1; i < colLen - 1; ++i){
            if (board[0][i] == 'O') dfs(0, i, board);
            if (board[rowLen - 1][i] == 'O') dfs(rowLen - 1, i, board);
        }
        
        for (int row = 0; row < rowLen; ++row){
            for (int col = 0; col < colLen; ++col){
                if (board[row][col] == 'T') board[row][col] = 'O';
                else if (board[row][col] == 'O') board[row][col] = 'X';
            }
        }
    }
    
    private void dfs(int row, int col, char[][] board){
        if (row < 0 || row == rowLen || col < 0 || col == colLen || board[row][col] != 'O') return;
        
        board[row][col] = 'T';
        
        dfs(row - 1, col, board);
        dfs(row + 1, col, board);
        dfs(row, col - 1, board);
        dfs(row, col + 1, board);
    }
}