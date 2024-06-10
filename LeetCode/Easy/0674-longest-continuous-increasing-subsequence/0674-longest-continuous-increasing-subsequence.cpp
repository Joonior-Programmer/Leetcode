class Solution {
public:
    int findLengthOfLCIS(vector<int>& nums) {
        int ret = 1;
        int currVal = nums[0];
        int curr = 1;
        
        for (int i = 1; i < nums.size(); ++i){
            if (nums[i] > currVal){
                currVal = nums[i];
                ++curr;
            } else {
                ret = max(curr, ret);
                curr = 1;
                currVal = nums[i];
            }
        }
        
        return max(ret, curr);
    }
};