class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ret = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; ++i)
            if (nums[i] == target) ret = Math.min(ret, Math.abs(i - start));
        
        return ret;
    }
}