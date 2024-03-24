class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] exist = new boolean[n];
        
        for (int i = 0; i < n; ++i)
            if (exist[nums[i]]) return nums[i];
            else exist[nums[i]] = true;
        
        return -1;
    }
}