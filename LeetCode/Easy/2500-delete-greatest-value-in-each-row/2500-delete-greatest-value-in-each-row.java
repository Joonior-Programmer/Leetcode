class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ret = 0;
        int n = grid.length;
        
        for (int i = 0; i < n; ++i) Arrays.sort(grid[i]);
        
        int col = grid[0].length - 1;
        
        while (col > -1){
            int temp = grid[0][col];
            
            for (int row = 1; row < n; ++row) temp = Math.max(temp, grid[row][col]);
            
            ret += temp;
            col--;
        }
        
        return ret;
    }
}