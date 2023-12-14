class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rowLen = grid.length;
        int colLen = grid[0].length;
        int[] oneRows = new int[rowLen];
        int[] oneCols = new int[colLen];

        for (int row = 0; row < rowLen; ++row){
            int temp = 0;
            for (int col = 0; col < colLen; ++col){
                temp += grid[row][col];
            }
            
            oneRows[row] = temp * 2 - rowLen;
        }

        for (int col = 0; col < colLen; ++col){
            int temp = 0;
            for (int row = 0; row < rowLen; ++row){
                temp += grid[row][col];
            }

            oneCols[col] = temp * 2 - colLen;
        }

        for (int row = 0; row < rowLen; ++row){
            for (int col = 0; col < colLen; ++col){
                grid[row][col] = oneRows[row] + oneCols[col];
            }
        }
        
        return grid;
    }
}