class Solution {
public:
    int numSubseq(vector<int>& nums, int target) {
        int ret = 0;
        int mod = 1000000007;
        int vals[nums.size()];
        vals[0] = 1;

        for (int i = 1; i < nums.size(); ++i){
            vals[i] = vals[i-1] * 2 % mod;
        }
        
        sort(nums.begin(), nums.end());

        int l = 0;
        int r = nums.size() - 1;
        
        while (l <= r) {
            if (nums[l] + nums[r] > target) r--;
            else {
                ret = (ret + vals[r - l]) % mod;
                ++l;
            }
        }
        
        return ret;
    }
};