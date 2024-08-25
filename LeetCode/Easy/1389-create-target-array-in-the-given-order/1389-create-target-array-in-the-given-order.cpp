class Solution {
public:
    vector<int> createTargetArray(vector<int>& nums, vector<int>& index) {
        vector<int> ret;
        
        for (int i = 0; i < nums.size(); ++i)
            ret.insert(ret.begin()+index[i], nums[i]);
        
        return ret;
    }
};