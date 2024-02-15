class Solution {
    public long largestPerimeter(int[] nums) {
        int n = nums.length;
        long sum = 0;

        for (int i = 0; i < nums.length; ++i) sum += nums[i];
        
        Arrays.sort(nums);
        
        for (int i = n - 1; i > 1; i--) {
            if (nums[i] < sum - nums[i]) return sum;
            sum -= nums[i];
        }
        
        return -1;
    }
}