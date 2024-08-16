class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        
        for (int i = 0; i < n; ++i) ret[i] = nums[nums[i]];
        
        return ret;
    }
}