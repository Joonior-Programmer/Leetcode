class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        vector<int> dp(amount+1);
        
        for (int i = 1; i < amount + 1; ++i){
            dp[i] = amount + 1;
            for (int coin : coins){
                if (i - coin >= 0) dp[i] = min(dp[i], 1 + dp[i - coin]);
            }
        }
        
        if (dp[amount] == amount + 1) return -1;
        return dp[amount];
    }
};