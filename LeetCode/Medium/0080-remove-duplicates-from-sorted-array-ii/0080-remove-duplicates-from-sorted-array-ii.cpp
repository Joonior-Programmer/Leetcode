class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i = 0;
        int count = 0;
        for (int j = 1; j < nums.size(); ++j){
            if (nums[i] == nums[j]){
                if (count < 1) {
                    nums[++i] = nums[j];
                }
                ++count;
            } else {
                nums[++i] = nums[j];
                count = 0;
            }
        }
        return i + 1;
    }
};