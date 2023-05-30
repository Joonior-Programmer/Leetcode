class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        int zeros = 0;
        int all_product = 1;
        
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] == 0) ++zeros;
            else all_product *= nums[i];
        }
        
        if (zeros > 1) return ret;
        
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] == 0) ret[i] = all_product;
            else if (zeros > 0) ret[i] = 0;
            else ret[i] = all_product / nums[i];
        }
        return ret;
    }
}