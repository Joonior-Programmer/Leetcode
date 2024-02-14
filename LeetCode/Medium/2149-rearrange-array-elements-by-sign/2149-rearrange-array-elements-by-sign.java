class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        int[] ret = new int[n];
        
        for (int idx = 0; idx < n; ++idx){
            if (nums[idx] > 0){
                ret[i] = nums[idx];
                i += 2;
            } else {
                ret[j] = nums[idx];
                j += 2;
            }   
        }
        
        return ret;
    }
}