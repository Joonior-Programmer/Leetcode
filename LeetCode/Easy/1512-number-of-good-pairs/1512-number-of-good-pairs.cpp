class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        vector<int> count(101);
        int ret = 0;
        
        for (int v : nums) ++count[v];
        
        for (int i = 1; i < 101; ++i)
            ret += count[i] * (count[i] - 1) / 2;
        
        return ret;
    }
};