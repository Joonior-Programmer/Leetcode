class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size() - 1;
        int nextMax = 0;
        int maxPosition = 0;
        int ret = 0;
        
        for (int i = 0; i < n; ++i){
            nextMax = max(nextMax, i + nums[i]);
            if (i == maxPosition){
                ++ret;
                maxPosition = nextMax;
                if (maxPosition >= n) return ret;
            }
        }
        
        return ret;
    }
};