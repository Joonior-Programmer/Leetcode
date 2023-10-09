class Solution {
    public int singleNumber(int[] nums) {
        int ret = 0;
        
        for (int i = 0; i < 32; ++i){
            int numOfBits = 0;
            for (int j = 0; j < nums.length; ++j){
                numOfBits += nums[j] >> i & 1;
            }
            ret += (numOfBits % 3) << i;
        }

        return ret;
    }
}