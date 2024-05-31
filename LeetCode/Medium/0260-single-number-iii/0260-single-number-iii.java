class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int mask = 0 ;
        for(int i= 0; i < n; ++i) mask ^= nums[i];
        
        mask &= -mask;

        int[] ret = new int[2];
        
        for(int v: nums)
            if((mask & v) == 0) ret[0] ^= v;
            else ret[1] ^= v;
        
        return ret;
    }
}