class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] count = new int[101];
        
        for (int v : nums)
            if (count[v]++ == 2) return false;
            
        return true;
    }
}