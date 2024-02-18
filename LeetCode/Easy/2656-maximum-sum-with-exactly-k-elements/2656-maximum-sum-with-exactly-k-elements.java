class Solution {
    public int maximizeSum(int[] nums, int k) {
        int ret = 0;
        int curr = 0;
        
        for (int i = 0; i < nums.length; ++i) curr = Math.max(curr, nums[i]);
        
        while (k > 0){
            ret += curr;
            ++curr;
            k--;
        }
        
        return ret;
    }
}