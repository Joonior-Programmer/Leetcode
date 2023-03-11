class Solution {
    public void moveZeroes(int[] nums) {
        int num_of_zero = 0;
        int idx = 0;
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] == 0) ++num_of_zero;
            else {
                nums[idx] = nums[i];
                ++idx;
            }
        }
        for (int i = nums.length - num_of_zero; i < nums.length; ++i){
            nums[i] = 0;
        }
    }
}