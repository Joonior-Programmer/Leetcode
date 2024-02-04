class Solution {
public:
    int returnToBoundaryCount(vector<int>& nums) {
        int curr = 0;
        int ret = 0;
        
        for (int i = 0; i < nums.size(); ++i){
            curr += nums[i];
            if (curr == 0) ++ret;
        }
        
        return ret;
    }
};