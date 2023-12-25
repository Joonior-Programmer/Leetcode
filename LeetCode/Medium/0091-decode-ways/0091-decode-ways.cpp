class Solution {
public:
    int numDecodings(string s) {
        int n = s.size();
        vector<int> dp(n+1);
        dp[n] = 1;
        
        for (int i = n - 1; i > -1; i--){
            char v = s[i];
            if (v != '0'){
                dp[i] = dp[i+1];
                if (i < n - 1 && (v == '1' || (v == '2' && s[i+1] < '7'))) dp[i] += dp[i+2];
            }
        }
        
        return dp[0];
    }
};