class Solution {
public:
    int minDifference(vector<int>& nums) {
        if (nums.size() < 5) return 0;
        
        sort(nums.begin(), nums.end());
        
        int n = nums.size();
        int ret = INT_MAX;
        
        for (int i = 0; i < 4; ++i) ret = min(ret, nums[n-4+i] - nums[i]);
        
        return ret;
    }
};