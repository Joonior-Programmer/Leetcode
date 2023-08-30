class Solution {
    public void gameOfLife(int[][] board) {
        int rowLen = board.length;
        int colLen = board[0].length;

        for (int r = 0; r < rowLen; ++r){
            for (int c = 0; c < colLen; ++c){
                int ones = 0;

                for (int row = Math.max(0, r-1); row < Math.min(rowLen, r+2); ++row)
                    for (int col = Math.max(0, c-1); col < Math.min(colLen, c+2); ++col)
                        ones += board[row][col] & 1;
                

                if (board[r][c] == 1 && (ones == 3 || ones == 4)) board[r][c] |= 2;
                else if (board[r][c] == 0 &&  ones == 3) board[r][c] |= 2;
            }
        }

        for (int r = 0; r < rowLen; ++r)
            for (int c = 0; c < colLen; ++c) board[r][c] >>= 1;
        
    }
}