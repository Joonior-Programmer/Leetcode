class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ret = 0;
        for (int i = 0; i < nums.length; ++i){
            if (count == 0){
                ret = nums[i];
            }

            if (ret == nums[i]){
                ++count;
            } else {
                count--;
            }
        }
        return ret;
    }
}