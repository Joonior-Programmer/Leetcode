class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int count = 0;
        int ret = 0;
        for ( int i = 0; i < nums.size(); ++i){
            if (!count){
                ret = nums[i];
            }
            
            if (ret == nums[i]){
                ++count;
            } else {
                count--;
            }
        }
        return ret;
    }
};