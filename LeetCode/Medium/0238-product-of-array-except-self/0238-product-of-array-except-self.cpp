class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> ret(nums.size(), 0);
        int zeros = 0;
        int all_product = 1;
        
        for (int i = 0; i < nums.size(); ++i){
            if (nums[i] == 0) ++zeros;
            else all_product *= nums[i];
        }
        
        if (zeros > 1) return ret;
        
        for (int i = 0; i < nums.size(); ++i){
            if (nums[i] == 0) ret[i] = all_product;
            else if (zeros == 0) ret[i] = all_product / nums[i];
        }
        return ret;
    }
};