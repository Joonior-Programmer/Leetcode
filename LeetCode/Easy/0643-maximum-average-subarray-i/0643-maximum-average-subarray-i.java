class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int temp = 0;
        for (int i = 0; i < k; ++i) temp += nums[i];

        int ret = temp;
        
        for (int i = 0; i < nums.length - k; ++i) {
            temp += nums[i+k] - nums[i];
            ret = Math.max(ret, temp);
        }
        
        return (double)ret / k;
    }
}