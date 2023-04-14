class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int ret = 0;
        int temp = 0;
        for (int i = 0; i < nums.size(); ++i){
            if (nums[i]){
                ret = max(++temp, ret);    
            } else {
                temp = 0;
            }
        }
        return ret;
    }
};