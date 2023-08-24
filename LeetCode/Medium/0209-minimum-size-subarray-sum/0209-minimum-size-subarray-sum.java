class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0, r = 0, n = nums.length;
        int temp = nums[0];
        int ret = Integer.MAX_VALUE;
        
        while (r < n){
            if (temp >= target){
                ret = Math.min(ret, r - l + 1);
                temp -= nums[l++];
            } else {
                ++r;
                if (r < n) temp += nums[r];
            }
        }
        
        if (ret == Integer.MAX_VALUE) return 0;
        
        return ret;
    }
}