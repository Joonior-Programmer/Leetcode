class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int ret = 0;
        
        for (int i = 0; i < nums.size(); ++i)
            if (nums[i] < k) ++ret;
        
        return ret;
    }
};