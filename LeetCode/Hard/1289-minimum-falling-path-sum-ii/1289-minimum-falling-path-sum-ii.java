class Solution {
    public int minFallingPathSum(int[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;

        if (colLen == 1) return grid[0][0];

        for (int row = rowLen - 1; row > 0; row--){
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            int idx = 0;
            for (int col = 0; col < colLen; ++col){
                int temp = grid[row][col];
                if (temp < first){
                    idx = col;
                    second = first;
                    first = temp;
                } else if (temp < second) second = temp;
            }
            
            for (int col = 0; col < colLen; ++col){
                if (idx == col) grid[row-1][col] += second;
                else grid[row-1][col] += first;
            }
        }

        int ret = Integer.MAX_VALUE;
        
        for (int i = 0; i < colLen; ++i) ret = Math.min(ret, grid[0][i]);
        
        return ret;
    }
}