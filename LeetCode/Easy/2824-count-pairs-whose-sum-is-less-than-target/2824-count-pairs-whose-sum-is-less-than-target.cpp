class Solution {
public:
    int countPairs(vector<int>& nums, int target) {
        int n = nums.size();
        int ret = 0;
        
        for (int i = 0; i < n; ++i){
            int temp = nums[i];
            
            for (int j = i + 1; j < n; ++j)
                if (temp + nums[j] < target) ++ret;
        }
        
        return ret;
    }
};