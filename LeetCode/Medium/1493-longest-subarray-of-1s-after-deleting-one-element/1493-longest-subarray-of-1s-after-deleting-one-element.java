class Solution {
    public int longestSubarray(int[] nums) {
        int prev = 0;
        int count = 0;
        int ret = 0;
        int zeroCount = 0;
        
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] == 1) ++count;
            else {
                ret = Math.max(ret, prev + count);
                prev = count;
                count = 0;
                ++zeroCount;
            }
        }
        
        if (zeroCount == 0) return count - 1;

        return Math.max(ret, prev + count);

    }
}