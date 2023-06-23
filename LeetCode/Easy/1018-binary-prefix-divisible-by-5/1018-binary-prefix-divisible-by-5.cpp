class Solution {
public:
    vector<bool> prefixesDivBy5(vector<int>& nums) {
        vector<bool> ret(nums.size());
        int sumNum = 0;
        
        for (int i = 0; i < nums.size(); ++i){
            sumNum = (sumNum << 1 | nums[i]) % 5;
            ret[i] = sumNum == 0;
        }
        
        return ret;
    }
};