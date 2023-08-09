class Solution {
    public int jump(int[] nums) {
        int n = nums.length - 1;
        int nextMax = 0;
        int maxPosition = 0;
        int ret = 0;
        
        for (int i = 0; i < n; ++i){
            nextMax = Math.max(nextMax, i + nums[i]);
            if (i == maxPosition){
                ++ret;
                maxPosition = nextMax;
                if (maxPosition >= n) return ret;
            }
        }
        
        return ret;
    }
}