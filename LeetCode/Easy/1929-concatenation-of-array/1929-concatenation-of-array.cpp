class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        int n = nums.size();
        vector<int> ret(n*2);
        
        for (int i = 0; i < n; ++i) {
            int temp = nums[i];
            ret[i] = temp;
            ret[n+i] = temp;
        }
        
        return ret;
    }
};