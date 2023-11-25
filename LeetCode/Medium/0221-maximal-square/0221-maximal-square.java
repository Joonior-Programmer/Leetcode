class Solution {
    public int maximalSquare(char[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;
        int ret = 0;
        int[][] dp = new int[rowLen][colLen];
        
        for (int i = 0; i < rowLen; ++i){
            for (int j = 0; j < colLen; ++j){
                if (matrix[i][j] == '1') {
                    dp[i][j] = 1;
                    ret = 1;
                }
            }
        }
        
        for (int i = 1; i < rowLen; ++i){
            for (int j = 1; j < colLen; ++j){
                if (dp[i][j] == 1){
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
                    ret = Math.max(ret, dp[i][j]);
                }
            }
        }
        
        return ret * ret;
    }
}