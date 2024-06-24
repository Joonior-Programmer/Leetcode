class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int ret = 0;
        int flippedTime = 0;

        for (int i = 0; i < n; ++i){
            if (i >= k && nums[i - k] == 2)
                flippedTime--;
            if (flippedTime % 2 == nums[i]){
                if (i + k > n) return -1;
                ++ret;
                ++flippedTime;
                nums[i] = 2;
            }
        }

        return ret;
    }
}