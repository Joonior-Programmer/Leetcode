class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for (int[] v : indices){
            int row = v[0];
            int col = v[1];
            
            for (int i = 0; i < n; ++i)
                ++matrix[row][i];
            
            for (int i = 0; i < m; ++i)
                ++matrix[i][col];
        }
        
        int ret = 0;
            
        for (int row = 0; row < m; ++row)
            for (int col = 0; col < n; ++col)
                if (matrix[row][col] % 2 == 1) ++ret;


        return ret;
    }
}