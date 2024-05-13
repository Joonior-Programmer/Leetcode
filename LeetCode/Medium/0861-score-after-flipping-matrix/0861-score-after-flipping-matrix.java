class Solution {
    public int matrixScore(int[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int ret = 0;
        
        for (int[] row : grid){
            if (row[0] == 0){
                row[0] = 1;
                for (int col = 1; col < colLen; ++col)
                    if (row[col] == 0) row[col] = 1;
                    else row[col] = 0;
            }
        }
        
        for (int col = 0; col < colLen; ++col){
            int count = 0;
            for (int row = 0; row < rowLen; ++row)
                if (grid[row][col] == 0) ++count;
                    
            if (count > rowLen / 2){
                for (int row = 0; row < rowLen; ++row)
                    if (grid[row][col] == 0) grid[row][col] = 1;
                    else grid[row][col] = 0;
            }
        }
        for (int[] row : grid){
            int temp = 0;
            for (int v : row) temp = temp * 2 + v;
            
            ret += temp;
        }

        return ret;
    }
}