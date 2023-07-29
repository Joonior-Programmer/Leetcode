class Solution {
public:
    int longestPalindromeSubseq(string s) {
        int n = s.size();
        int dp[n+1][n+1];
        string s1 = string(s);
        reverse(s1.begin(), s1.end());
        
        for (int i = 0; i < n; ++i){
            dp[n][i] = 0;
            dp[i][n] = 0;
        }
        
        dp[n][n] = 0;

        for (int i = n-1; i > -1; i--){
            for (int j = n-1; j > -1; j--){
                if (s[i] == s1[j]) dp[i][j] = 1 + dp[i+1][j+1];
                else dp[i][j] = max(dp[i+1][j], dp[i][j+1]);
            }
        }
        
        return dp[0][0];
    }
};