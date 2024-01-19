class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length - 1;
        int ret = Integer.MAX_VALUE;
        
        for (int i = n - 1; i > -1; i--){
            matrix[i][n] += Math.min(matrix[i+1][n-1], matrix[i+1][n]);
            matrix[i][0] += Math.min(matrix[i+1][0], matrix[i+1][1]);
            for (int j = n - 1; j > 0; j--) 
                matrix[i][j] += Math.min(matrix[i+1][j-1], Math.min(matrix[i+1][j], matrix[i+1][j+1]));
        }           
        
        for (int i = 0; i < n + 1; ++i) ret = Math.min(ret, matrix[0][i]);
        
        return ret;
    }
}