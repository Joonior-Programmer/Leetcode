class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] l_sum = new int[n];
        int[] r_sum = new int[n];

        for (int i = 1; i < n; ++i)
            l_sum[i] = l_sum[i-1] + nums[i-1];
        
        for (int i = n-2; i > -1; i--)
            r_sum[i] = r_sum[i+1] + nums[i+1];

        for (int i = 0; i < n; ++i) l_sum[i] = Math.abs(l_sum[i] - r_sum[i]);
        
        return l_sum;
    }
}