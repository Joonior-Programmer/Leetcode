class Solution {
public:
    int maxWidthRamp(vector<int>& nums) {
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        
        int n = nums.size();
        int ret = 0;
        vector<int> stack(n);
        stack[0] = 0;
        int i = 1;
        
        for (int j = 1; j < n; ++j)
            if (nums[stack[i-1]] > nums[j]) stack[i++] = j;
        
        int j = n - 1;
        
        while (i > 0 && j > -1){
            while (i > 0 && nums[stack[i-1]] <= nums[j]){
                ret = max(ret, j - stack[(i--)-1]);
            }
            j--;
        }
        
        return ret;
    }
};