class Solution {
    public int arraySign(int[] nums) {
        double ret = 1;
        for (int i = 0; i < nums.length; ++i){
            ret *= nums[i];
        }
        return ret > 0 ? 1 : ret < 0 ? -1 : 0;
    }
}