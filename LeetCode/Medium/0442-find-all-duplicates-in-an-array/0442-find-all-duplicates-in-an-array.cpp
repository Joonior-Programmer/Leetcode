class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        int n = nums.size() + 1;
        vector<int> ret;
        vector<bool> exist(n);
        
        for (int v : nums){
            if (exist[v]) ret.push_back(v);
            else exist[v] = true;
        }
         
        return ret;
    }
};