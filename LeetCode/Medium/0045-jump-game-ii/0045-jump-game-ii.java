class Solution {
    public int jump(int[] nums) {
        int n = nums.length - 1;
        int nextMax = 0;
        int maxPosition = 0;
        int ret = 0;
        int i = 0;
        
        while (i < n && maxPosition < n){
            while (i <= maxPosition) nextMax = Math.max(nextMax, i + nums[i++]);
            ++ret;
            maxPosition = nextMax;
        }
        
        return ret;
    }
}