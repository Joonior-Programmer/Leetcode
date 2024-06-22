class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[n+1];
        ++count[0];
        int curr = 0;
        int ret = 0;

        for (int v : nums){
            if (v % 2 == 1) ++curr;
            if (curr >= k) ret += count[curr-k];
            ++count[curr];
        }

        return ret;
    }
}