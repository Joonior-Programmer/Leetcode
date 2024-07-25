class Solution {
    public int[] sortArray(int[] nums) {
        int[] count = new int[100001];
        int idx = 0;
        for (int v : nums) ++count[v+50000];

        for (int i = 0; i < 100001; ++i)
            for (int j = 0; j < count[i]; ++j) nums[idx++] = i - 50000;

        return nums;
    }
}