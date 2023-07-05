class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int n = nums.size();
        int ret = 0;
        int l = 0;
        int r = 0;
        
        while (r < n){
            while (r < n && k > 0) {
                if (nums[r] == 0) k--;
                ++r;
            }
            
            while (r < n && nums[r] == 1) ++r;
            
            ret = max(ret, r - l);
            
            while (l < n && nums[l] == 1) ++l;
            
            ++l;
            ++k;
        }
        
        return ret;
    }
};