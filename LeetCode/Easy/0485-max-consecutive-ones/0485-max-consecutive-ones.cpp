class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int ret = 0;
        int temp = 0;
        for (int i = 0; i < nums.size(); ++i){
            if (nums[i] == 0){
                ret = max(ret, temp);
                temp = 0;
                continue;
            }
            ++temp;
        }
        return max(ret, temp);
    }
};