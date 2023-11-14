class Solution {
    public int minPathSum(int[][] grid) {
        int colLen = grid[0].length;
        int rowLen = grid.length;
        
        for (int row = 1; row < rowLen; ++row) grid[row][0] += grid[row-1][0];
        for (int col = 1; col < colLen; ++col) grid[0][col] += grid[0][col-1];
        
        for (int row = 1; row < rowLen; ++row)
            for (int col = 1; col < colLen; ++col) 
                grid[row][col] += Math.min(grid[row-1][col], grid[row][col-1]);
        
        return grid[rowLen-1][colLen-1];
    }
}