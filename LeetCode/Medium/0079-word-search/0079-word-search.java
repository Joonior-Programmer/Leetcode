class Solution {
    char[][] board;
    int rowLen;
    int colLen;
    int n;
    char[] target;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        rowLen = board.length;
        colLen = board[0].length;
        
        target = word.toCharArray();
        n = target.length;
        
        for (int row = 0; row < rowLen; ++row){
            for (int col = 0; col < colLen; ++col){
                if (board[row][col] == target[0]){
                    if (dfs(row, col, 0)) return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean dfs(int row, int col, int idx){
        ++idx;
        if (idx == n) return true;
        
        char temp = board[row][col];
        board[row][col] = '?';
        
        if (row > 0 && board[row-1][col] == target[idx] && dfs(row-1, col, idx)) return true;
        if (row < rowLen - 1 && board[row+1][col] == target[idx] && dfs(row+1, col, idx)) return true;
        if (col > 0 && board[row][col-1] == target[idx] && dfs(row, col - 1, idx)) return true;
        if (col < colLen - 1  && board[row][col+1] == target[idx] && dfs(row, col+1, idx)) return true;
        
        board[row][col] = temp;
        
        return false;
    }
}