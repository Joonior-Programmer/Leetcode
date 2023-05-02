class Solution {
public:
    int arraySign(vector<int>& nums) {
        double ret = 1;
        for (int i = 0; i < nums.size(); ++i){
            ret *= nums[i];
        }
        return ret > 0 ? 1 : ret < 0 ? -1 : 0;
    }
};