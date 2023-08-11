class Solution {
public:
    int change(int amount, vector<int>& coins) {
        
        vector<int> dp(amount+1, 0);
        dp[0] = 1;
        
        for (int i = coins.size()-1; i > -1; i--){
            for (int j = coins[i]; j < amount + 1; ++j){
                dp[j] += dp[j - coins[i]];
            }
        }

        return dp[amount];
    }
};