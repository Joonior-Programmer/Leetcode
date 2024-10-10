class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int ret = 0;
        int[] stack = new int[n];
        stack[0] = 0;
        int i = 1;
        
        for (int j = 1; j < n; ++j)
            if (nums[stack[i-1]] > nums[j]) stack[i++] = j;
        
        int j = n - 1;
        
        while (i > 0 && j > -1){
            while (i > 0 && nums[stack[i-1]] <= nums[j]){
                ret = Math.max(ret, j - stack[(i--)-1]);
            }
            j--;
        }
        
        return ret;
    }
}