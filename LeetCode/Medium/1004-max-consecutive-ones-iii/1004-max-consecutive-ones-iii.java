class Solution {
    public int longestOnes(int[] nums, int k) {
        int ret = 0;
        int l = 0;
        int r = 0;
        
        while (r < nums.length){
            while (r < nums.length && k > 0){
                if (nums[r] == 0) k--;
                ++r;
            }
            
            while (r < nums.length && nums[r] == 1) ++r;
            
            ret = Math.max(ret, r - l);
            
            while (l < nums.length && nums[l] != 0) ++l;
            
            ++l;
            ++k;
        }
        
        return ret;
    }
}