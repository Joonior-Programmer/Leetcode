class Solution {
    public int maxSubArray(int[] nums) {
        int ret = Integer.MIN_VALUE;
        int curr = 0;
        
        for (int i = 0; i < nums.length; ++i){
            curr += nums[i];
            ret = Math.max(ret, curr);
            curr = Math.max(0, curr);
        }
        
        return ret;
    }
}