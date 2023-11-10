class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int ret = 0;
        
        for (int i = nums.length-1; i > -1; i--){
            for (int j = i; j < nums.length; ++j){
                if (nums[i] < nums[j]) dp[i] = Math.max(dp[i], 1 + dp[j]);
            }
        }
        
        for (int i = 0; i < nums.length; ++i) ret = Math.max(ret, dp[i]);
        
        return ret + 1;
    }
}