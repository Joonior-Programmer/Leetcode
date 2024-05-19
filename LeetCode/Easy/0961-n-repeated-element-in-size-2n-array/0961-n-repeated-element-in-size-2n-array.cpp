class Solution {
public:
    int repeatedNTimes(vector<int>& nums) {
        int n = nums.size();
        vector<bool> exist(10001);
        
        for (int v : nums){
            if (exist[v]) return v;
            exist[v] = true;
        }
        
        return -1;
    }
};