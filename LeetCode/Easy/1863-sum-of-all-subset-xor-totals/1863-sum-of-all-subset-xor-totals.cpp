class Solution {
public:
    int subsetXORSum(vector<int>& nums) {
        int n = nums.size();
        int ret = 0;
        
        for (int num : nums) ret |= num;
        
        return ret * (1 << (n-1));
    }
};