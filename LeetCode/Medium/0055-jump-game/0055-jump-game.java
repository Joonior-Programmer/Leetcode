class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxPosition = nums[0];
        
        for (int i = 1; i < n; ++i){
            if (i > maxPosition) return false;
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (maxPosition >= n) return true;
        }
        
        return true;
    }
}