class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        boolean[] exist = new boolean[201];
        int ret = 0;
        
        for (int num : nums) exist[num] = true;
        
        for (int i = 0; i < 201 - diff * 2; ++i)
            if (exist[i] && exist[i + diff] && exist[i + diff * 2]) ++ret;
        
        return ret;
    }
}