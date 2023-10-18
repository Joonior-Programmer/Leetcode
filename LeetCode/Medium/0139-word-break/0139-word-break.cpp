class Solution {
public:
    bool wordBreak(string s, vector<string>& wordDict) {
        int n = s.size();
        vector<bool> dp(n+1);
        dp[n] = true;
        
        for (int i = n - 1; i > -1; i--){
            for (string v : wordDict){
                if (i + v.size() <= n && s.substr(i, v.size()) == v) dp[i] = dp[i + v.size()];
                if (dp[i]) break;
            }
        }
        
        return dp[0];
    }
};