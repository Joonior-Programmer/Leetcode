class Solution {
public:
    long long largestPerimeter(vector<int>& nums) {
        int n = nums.size();
        long long sum = 0;

        for (int i = 0; i < n; ++i) sum += nums[i];
        
        sort(nums.begin(), nums.end());
        
        for (int i = n - 1; i > 1; i--) {
            if (nums[i] < sum - nums[i]) return sum;
            sum -= nums[i];
        }
        
        return -1;
    }
};