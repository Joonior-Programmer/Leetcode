class Solution {
    int[][] grid1;
    int[][] grid2;
    int rowLen;
    int colLen;
    
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int ret = 0;
        
        this.grid1 = grid1;
        this.grid2 = grid2;
        rowLen = grid1.length - 1;
        colLen = grid1[0].length - 1;

        for (int r = 0; r < rowLen + 1; ++r)
            for (int c = 0; c < colLen + 1; ++c)
                if (grid1[r][c] == 1 && grid2[r][c] == 1)
                    if (dfs(r, c)) ++ret;
        
        return ret;
    }
    
    private boolean dfs(int row, int col){
        if (grid1[row][col] == 0 && grid2[row][col] == 1) return false;

        if (grid2[row][col] == 0) {
            grid2[row][col] = 0;
            return true;
        }

        grid2[row][col] = 0;

        boolean l = true, r = true, u = true, d = true;

        if (row < rowLen) r = dfs(row + 1, col);
        if (row > 0) l = dfs(row - 1, col);
        if (col < colLen) u = dfs(row, col + 1);
        if (col > 0) d = dfs(row, col - 1);

        return l && r && u && d;
    }
}