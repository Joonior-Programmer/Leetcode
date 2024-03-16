class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n * 2];
        
        for (int i = 0; i < n; ++i) {
            int temp = nums[i];
            ret[i] = temp;
            ret[n+i] = temp;
        }
        
        return ret;
    }
}