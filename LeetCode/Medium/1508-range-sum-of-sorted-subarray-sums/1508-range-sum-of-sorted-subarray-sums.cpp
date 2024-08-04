class Solution {
public:
    int rangeSum(vector<int>& nums, int n, int left, int right) {
        vector<int> newArr(n * (n + 1) / 2);
        int idx = 0;
        int ret = 0;

        for (int i = 0; i < n; ++i){
            int curr = 0;
            for (int j = i; j < n; ++j) {
                curr += nums[j];
                newArr[idx++] = curr;
            }
        }

        sort(newArr.begin(), newArr.end());

        for (int i = left - 1; i < right; ++i) ret = (ret + newArr[i]) % 1000000007;

        return ret;
    }
};