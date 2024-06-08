class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> exist;
        exist[0] = -1;
        int curr = 0;
        
        for (int i = 0; i < nums.size(); ++i){
            curr = (curr + nums[i]) % k;
            
            if (exist.find(curr) == exist.end()) exist[curr] = i;
            else if (i - exist[curr] > 1) return true;
        }
        
        return false;
    }
};