class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        int[][] dp = new int[m+1][n+1];
        
        for (int i = 0; i < m; ++i) dp[i][n] = m - i;
        for (int i = 0; i < n; ++i) dp[m][i] = n - i;
        
        for (int i = m - 1; i > -1; i--) {
            for (int j = n - 1; j > -1; j--) {
                if (word1Array[j] == word2Array[i]) dp[i][j] = dp[i+1][j+1];
                else dp[i][j] = 1 + Math.min(dp[i+1][j], Math.min(dp[i+1][j+1], dp[i][j+1]));
            }
        }
        
        return dp[0][0];
    }
}