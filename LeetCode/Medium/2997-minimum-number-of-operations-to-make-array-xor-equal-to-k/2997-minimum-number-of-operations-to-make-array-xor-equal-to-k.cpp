class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int curr = nums[0];
        int ret = 0;
        
        for (int i = 1; i < nums.size(); ++i)
            curr ^= nums[i];
        
        while (curr > 0 || k > 0){
            if (curr % 2 != k % 2) ++ret;
            curr >>= 1;
            k >>= 1;
        }
            
        return ret;
    }
};