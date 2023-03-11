class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int num_of_zero = 0;
        int idx = 0;
        for (int i = 0; i < nums.size(); ++i){
            if(nums[i] == 0) ++num_of_zero;
            else {
                nums[idx] = nums[i];
                ++idx;
            }
        }
        for (int i = nums.size() - num_of_zero; i < nums.size(); ++i){
            nums[i] = 0;
        }
    }
};