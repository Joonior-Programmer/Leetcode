class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ret = new int[m][n];
        
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                ret[i][j] = matrix[j][i];
        
        return ret;
    }
}