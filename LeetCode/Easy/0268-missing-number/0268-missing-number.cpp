class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int sum = 0;
        int originalSum = 0;
        for (int i = 0; i < nums.size(); ++i) sum += nums[i];
        for (int i = 1; i < nums.size()+1; ++i) originalSum += i;
        return originalSum - sum;
    }
};