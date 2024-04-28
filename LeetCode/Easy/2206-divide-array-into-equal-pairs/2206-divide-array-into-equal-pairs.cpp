class Solution {
public:
    bool divideArray(vector<int>& nums) {
        vector<int> count(501);
        
        for (int v : nums) ++count[v];
        
        for (int i = 1; i < 501; ++i)
            if (count[i] % 2 == 1)
                return false;
        
        return true;
    }
};