class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] newArr = new int[n * (n + 1) / 2];
        int idx = 0;
        int ret = 0;

        for (int i = 0; i < n; ++i){
            int curr = 0;
            for (int j = i; j < n; ++j) {
                curr += nums[j];
                newArr[idx++] = curr;
            }
        }

        Arrays.sort(newArr);

        for (int i = left - 1; i < right; ++i) ret = (ret + newArr[i]) % 1_000_000_007;

        return ret;
    }
}