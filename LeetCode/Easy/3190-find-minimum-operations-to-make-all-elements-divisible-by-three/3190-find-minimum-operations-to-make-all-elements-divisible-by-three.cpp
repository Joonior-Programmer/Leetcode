class Solution {
public:
    int minimumOperations(vector<int>& nums) {
        int ret = 0;
        
        for (int v : nums)
            if (v % 3 != 0) ++ret;
        
        return ret;
    }
};