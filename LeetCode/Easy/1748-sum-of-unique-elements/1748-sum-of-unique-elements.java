class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        int ret = 0;
        
        for (int v : nums)
            ++count[v];

        for (int i = 1; i < 101; ++i)
            if (count[i] == 1)
                ret += i;

        return ret;
    }
}