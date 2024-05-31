class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        int n = nums.size();
        unsigned int mask = 0 ;
        for(int i= 0; i < n; ++i) mask ^= nums[i];
        
        mask &= -mask;

        vector<int> ret(2);
        
        for(int v: nums)
            if((mask & v) == 0) ret[0] ^= v;
            else ret[1] ^= v;
        
        return ret;
    }
};