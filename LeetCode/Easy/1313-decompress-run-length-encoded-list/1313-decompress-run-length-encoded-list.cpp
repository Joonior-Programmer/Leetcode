class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        vector<int> ret;
        
        for (int i = 0; i < nums.size(); i = i + 2) {
            int temp = nums[i+1];
            for (int j = 0; j < nums[i]; ++j) ret.push_back(temp);
        }
        
        return ret;
    }
};