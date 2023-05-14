class Solution {
public:
    int findLHS(vector<int>& nums) {
        int ret = 0;
        sort(nums.begin(), nums.end());
        int prev = nums[0];
        int prevCount = 0;
        int curCount = 1;
        for (int i = 1; i < nums.size(); ++i){
            if (nums[i] != nums[i-1]) {
                prevCount = curCount;
                prev = nums[i-1];
                curCount = 0;
            }
            ++curCount;

            if (nums[i] - 1 == prev) {
                ++prevCount;
                ret = max(ret, prevCount);
            }

        }
        return ret;
    }
};