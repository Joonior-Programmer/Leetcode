class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] box = new int[9][9];
        
        for (int r = 0; r < 9; ++r){
            for (int c = 0; c < 9; ++c){
                int v = board[r][c];
                
                if (v == '.') continue;

                v -= 49;

                int boxNum = (c < 3 ? 0 : c < 6 ? 1 : 2) + (3 * (r < 3 ? 0 : r < 6 ? 1 : 2));

                if (row[r][v] > 0 || col[c][v] > 0 || box[boxNum][v] > 0) return false;

                ++row[r][v];
                ++col[c][v];
                ++box[boxNum][v];
            }
        }
        
        return true;
    }
}