class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> count(101);
        int curr = 0;
        
        for (int i = 0; i < nums.size(); ++i) ++count[nums[i]];
        
        for (int i = 0; i < 101; ++i) {
            int temp = count[i];
            count[i] = curr;
            curr += temp;
        }
        
        for (int i = 0; i < nums.size(); ++i) nums[i] = count[nums[i]];
        
        return nums;
    }
};