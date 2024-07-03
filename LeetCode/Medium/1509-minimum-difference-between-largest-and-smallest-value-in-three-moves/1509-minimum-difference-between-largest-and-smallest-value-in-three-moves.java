class Solution {
    public int minDifference(int[] nums) {
        if (nums.length < 5) return 0;
        
        Arrays.sort(nums);
        
        int n = nums.length;
        int ret = Integer.MAX_VALUE;
        
        for (int i = 0; i < 4; ++i) ret = Math.min(ret, nums[n-4+i] - nums[i]);
        
        return ret;
    }
}