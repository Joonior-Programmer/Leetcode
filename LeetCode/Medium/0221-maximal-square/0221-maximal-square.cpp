class Solution {
public:
    int maximalSquare(vector<vector<char>>& matrix) {
        int rowLen = matrix.size();
        int colLen = matrix[0].size();
        int ret = 0;
        vector<vector<int>> dp(rowLen, vector<int>(colLen));
        
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
                    dp[i][j] = min(dp[i-1][j], min(dp[i][j-1], dp[i-1][j-1])) + 1;
                    ret = max(ret, dp[i][j]);
                }
            }
        }
        
        return pow(ret, 2);
    }
};