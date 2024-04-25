class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        int curr = 0;
        
        for (int i = 0; i < n; ++i){
            curr += nums[i];
            ret[i] = curr;
        }
        
        return ret;
    }
}