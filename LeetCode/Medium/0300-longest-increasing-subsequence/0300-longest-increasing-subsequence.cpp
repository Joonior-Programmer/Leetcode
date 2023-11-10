class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        vector<int> dp(nums.size(), 1);
        int ret = 1;
        
        for (int i = nums.size() - 1; i > -1; i--){
            for (int j = i + 1; j < nums.size(); ++j){
                if (nums[i] < nums[j]) dp[i] = max(dp[i], 1 + dp[j]);
            }
        }

        for (int i = 0; i < nums.size(); ++i) ret = max(ret, dp[i]);

        return ret;
    }
};