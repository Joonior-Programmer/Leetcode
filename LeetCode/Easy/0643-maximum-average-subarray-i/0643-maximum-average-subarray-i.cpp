class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        int temp = 0;
        for (int i = 0; i < k; ++i) temp += nums[i];

        int ret = temp;
        
        for (int i = 0; i < nums.size() - k; ++i) {
            temp += nums[i+k] - nums[i];
            ret = max(ret, temp);
        }
        
        return (double) ret / k;
    }
};