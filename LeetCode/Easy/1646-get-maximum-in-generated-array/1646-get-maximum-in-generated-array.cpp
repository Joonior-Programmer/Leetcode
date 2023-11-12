class Solution {
public:
    int getMaximumGenerated(int n) {
        int ret = 0;
        vector<int>dp(n+2);
        dp[1] = 1;
        
        
        for (int i = 1; i < n / 2 + 1; ++i){
            dp[2*i] = dp[i];
            dp[2*i+1] = dp[i] + dp[i+1];
        }
        
        for (int i = 0; i < n+1; ++i) ret = max(ret, dp[i]);
        
        return ret;
    }
};