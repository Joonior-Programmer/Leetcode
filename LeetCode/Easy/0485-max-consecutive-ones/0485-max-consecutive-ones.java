class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ret = 0;
        int temp = 0;
        for(int i = 0; i < nums.length; ++i){
            if (nums[i] == 0) {
                ret = Math.max(ret, temp);
                temp = 0;
                continue;
            }
            ++temp;
        }
        return Math.max(ret, temp);
    }
}