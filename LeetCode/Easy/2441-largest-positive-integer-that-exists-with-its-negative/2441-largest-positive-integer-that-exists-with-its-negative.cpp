class Solution {
public:
    int findMaxK(vector<int>& nums) {
        vector<bool> check(2001);
        
        for (int v : nums) check[v+1000] = true;
        
        for (int i = 1000; i > -1; i--)
            if (check[i+1000] && check[1000-i]) return i;
        
        return -1;
    }
};