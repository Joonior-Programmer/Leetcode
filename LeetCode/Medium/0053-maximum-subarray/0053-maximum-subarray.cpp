class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        std::ios::sync_with_stdio(0); 
        std::cin.tie(0);
        
        int ret = INT_MIN;
        int curr = 0;
        
        for (int i = 0; i < nums.size(); ++i){
            curr += nums[i];
            ret = max(ret, curr);
            curr = max(0, curr);
        }
        
        return ret;
    }
};