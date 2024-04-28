class Solution {
    public boolean divideArray(int[] nums) {
        int[] count = new int[501];
        
        for (int v : nums) ++count[v];
        
        for (int i = 1; i < 501; ++i)
            if (count[i] % 2 == 1)
                return false;
        
        return true;
    }
}