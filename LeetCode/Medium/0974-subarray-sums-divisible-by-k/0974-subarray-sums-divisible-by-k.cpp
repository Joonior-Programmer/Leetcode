class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int curr = 0;
        int ret = 0;
        vector<int> exist(10001);
        
        for (int v : nums){
            curr = ((curr + v) % k + k) % k;

            if (curr == 0) ++ret;
            if (exist[curr] > 0) ret += exist[curr];
            
            ++exist[curr];
        }
        
        return ret;
    }
};