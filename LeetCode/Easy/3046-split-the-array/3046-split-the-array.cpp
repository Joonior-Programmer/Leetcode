class Solution {
public:
    bool isPossibleToSplit(vector<int>& nums) {
        vector<int> count(101);
        
        for (int v : nums)
            if (count[v]++ == 2) return false;
            
        return true;
    }
};