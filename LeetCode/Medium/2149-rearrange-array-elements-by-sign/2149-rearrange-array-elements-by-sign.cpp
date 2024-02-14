class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n = nums.size();
        int i = 0;
        int j = 1;
        vector<int> ret(n);
        
        for (int idx = 0; idx < n; ++idx){
            if (nums[idx] > 0){
                ret[i] = nums[idx];
                i += 2;
            } else {
                ret[j] = nums[idx];
                j += 2;
            }   
        }
        
        return ret;
    }
};