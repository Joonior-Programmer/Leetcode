class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        int n = nums.length;
        for (int i = 0; i < n; i = i + 2) len += nums[i];
        
        int[] ret = new int[len];
        int idx = 0;
        
        for (int i = 0; i < n; i = i + 2) {
            Arrays.fill(ret, idx, idx+nums[i], nums[i+1]);
            idx += nums[i];
        }
        
        return ret;
    }
}