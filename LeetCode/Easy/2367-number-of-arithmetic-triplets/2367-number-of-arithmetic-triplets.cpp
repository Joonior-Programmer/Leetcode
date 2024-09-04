class Solution {
public:
    int arithmeticTriplets(vector<int>& nums, int diff) {
        vector<bool> exist(201);
        int ret = 0;
        
        for (int num : nums) exist[num] = true;
        
        for (int i = 0; i < 201 - diff * 2; ++i)
            if (exist[i] && exist[i + diff] && exist[i + diff * 2]) ++ret;
        
        return ret;
    }
};