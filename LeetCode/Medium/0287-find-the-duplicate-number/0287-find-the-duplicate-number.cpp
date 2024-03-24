class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int n = nums.size();
        vector<bool> exist(n);
        
        for (int i = 0; i < n; ++i)
            if (exist[nums[i]]) return nums[i];
            else exist[nums[i]] = true;
        
        return -1;
    }
};