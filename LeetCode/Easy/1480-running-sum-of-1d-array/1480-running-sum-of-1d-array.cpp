class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int n = nums.size();
        vector<int> ret(n);
        int curr = 0;
        
        for (int i = 0; i < n; ++i){
            curr += nums[i];
            ret[i] = curr;
        }
        
        return ret;
    }
};