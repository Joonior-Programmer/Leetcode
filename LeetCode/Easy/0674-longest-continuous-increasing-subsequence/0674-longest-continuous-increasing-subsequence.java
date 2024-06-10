class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ret = 1;
        int currVal = nums[0];
        int curr = 1;
        for (int i = 1; i < nums.length; ++i){
            if (nums[i] > currVal){
                currVal = nums[i];
                ++curr;
            } else {
                ret = Math.max(curr, ret);
                curr = 1;
                currVal = nums[i];
            }
        }
        
        return Math.max(ret, curr);
    }
}