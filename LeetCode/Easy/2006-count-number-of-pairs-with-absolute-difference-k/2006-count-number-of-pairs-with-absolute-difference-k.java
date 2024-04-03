class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[101];
        int ret = 0;
        
        for (int i = 0; i < n; ++i) ++count[nums[i]];
        
        for (int i = 1; i < 101 - k; ++i)
            ret += count[i] * count[i+k];
        
        return ret;
    }
}