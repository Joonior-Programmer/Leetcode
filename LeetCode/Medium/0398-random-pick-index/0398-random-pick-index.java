class Solution {
    int[] nums;
    
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int pick(int target) {
        int idx = (int)(Math.random() * nums.length);
        while (nums[idx] != target) idx = (int)(Math.random() * nums.length);
        
        return idx;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */