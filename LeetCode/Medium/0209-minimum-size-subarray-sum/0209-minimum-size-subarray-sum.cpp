class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int l = 0, r = 0, n = nums.size();
        int temp = nums[0];
        int ret = INT_MAX;
        
        while (r < n){
            if (temp >= target){
                ret = min(ret, r - l + 1);
                temp -= nums[l++];
            } else {
                ++r;
                if (r < n) temp += nums[r];
            }
        }
        
        if (ret == INT_MAX) return 0;
        
        return ret;
    }
};