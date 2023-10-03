class Solution {
    boolean[][] visited;
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
        
        visited = new boolean[rowLen][colLen];
        
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
        visited[row][col] = true;
        ++idx;
        
        if (idx == n) return true;
        
        if (row > 0 && !visited[row-1][col] && board[row-1][col] == target[idx] && dfs(row-1, col, idx)) return true;
        if (row < rowLen - 1 && !visited[row+1][col] && board[row+1][col] == target[idx] && dfs(row+1, col, idx)) return true;
        if (col > 0 && !visited[row][col-1] && board[row][col-1] == target[idx] && dfs(row, col - 1, idx)) return true;
        if (col < colLen - 1 && !visited[row][col + 1] && board[row][col+1] == target[idx] && dfs(row, col+1, idx)) return true;
        
        visited[row][col] = false;
        
        return false;
    }
}