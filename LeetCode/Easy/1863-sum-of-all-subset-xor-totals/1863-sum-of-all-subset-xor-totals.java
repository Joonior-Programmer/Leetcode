class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int ret = 0;
        
        for (int num : nums) ret |= num;
        
        return ret * (1 << (n-1));
    }
}