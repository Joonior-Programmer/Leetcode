class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        int n = nums.size();
        vector<int> l_sum(n);
        vector<int> r_sum(n);

        for (int i = 1; i < n; ++i)
            l_sum[i] = l_sum[i-1] + nums[i-1];
        
        for (int i = n-2; i > -1; i--)
            r_sum[i] = r_sum[i+1] + nums[i+1];

        for (int i = 0; i < n; ++i) l_sum[i] = abs(l_sum[i] - r_sum[i]);
        
        return l_sum;
    }
};