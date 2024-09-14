class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        ios::sync_with_stdio(false);
        cin.tie(nullptr);
        cout.tie(nullptr);
        
        int ret = 1;
        int curr = 0;
        int target = 0;
        
        for (int v : nums){
            if (target < v){
                ret = 1;
                curr = 0;
                target = v;
            }
            
            if (v == target) ++curr;
            else {
                ret = max(ret, curr);
                curr = 0;
            }
        }
        
        ret = max(ret, curr);
        
        return ret;
    }
};