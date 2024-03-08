class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int max = 0;
        int ret = 0;

        for (int i = 0; i < nums.length; i++) { count[nums[i]]++; }

        for (int i = 1; i < 101; i++) {
            if (count[i] > max) {
                max = count[i];
                ret = max;
            } else if (count[i] == max) {
                ret += max;
            }
        }

        return ret;
    }
}