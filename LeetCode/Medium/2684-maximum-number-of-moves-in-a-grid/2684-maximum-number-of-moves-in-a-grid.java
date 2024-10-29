class Solution {
    public int maxMoves(int[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;
        
        boolean[] prev = new boolean[rowLen];

        for (int i = 0; i < rowLen; ++i) prev[i] = true;
        
        for (int col = 1; col < colLen; ++col){
            boolean[] curr = new boolean[rowLen];

            for (int row = 0; row < rowLen; ++row){
                if (row > 0 && grid[row-1][col-1] < grid[row][col]) curr[row] |= prev[row-1];
                if (row < rowLen - 1 && grid[row+1][col-1] < grid[row][col]) curr[row] |= prev[row+1];
                if (grid[row][col-1] < grid[row][col]) curr[row] |= prev[row];
            }
            
            boolean isGood = false;
            for (int i = 0; i < rowLen; ++i)
                if (curr[i]){
                    isGood = true;
                    break;
                }
            
            if (!isGood) return col - 1;
            
            prev = curr;
        }

        return colLen - 1;
    }
}