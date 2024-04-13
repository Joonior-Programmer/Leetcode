class Solution {
public:
    int minMaxGame(vector<int>& nums) {
        if (nums.size() == 1) return nums[0];

        vector<int> temp(nums.size() / 2);
        
        for (int i = 0; i < nums.size() / 2; ++i){
            if (i % 2 == 0) temp[i] = min(nums[i * 2], nums[i * 2 + 1]);
            else temp[i] = max(nums[i * 2], nums[i * 2 + 1]);
        }
                         
        return minMaxGame(temp);
    }
};