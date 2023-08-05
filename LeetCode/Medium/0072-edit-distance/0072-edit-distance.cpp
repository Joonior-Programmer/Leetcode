class Solution {
public:
    int minDistance(string word1, string word2) {
        int n = word1.size();
        int m = word2.size();
        int dp[m+1][n+1];
        
        dp[m][n] = 0;
        
        for (int i = 0; i < m; ++i) dp[i][n] = m - i;
        for (int i = 0; i < n; ++i) dp[m][i] = n - i;
        
        for (int i = m-1; i > -1; i--){
            for (int j = n-1; j > -1; j--){
                if (word1[j] == word2[i]) dp[i][j] = dp[i+1][j+1];
                else dp[i][j] = 1 + min(dp[i+1][j], min(dp[i+1][j+1], dp[i][j+1]));
            }
        }
        
        return dp[0][0];
    }
};