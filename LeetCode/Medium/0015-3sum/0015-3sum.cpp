class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ret;
        sort(nums.begin(), nums.end());
        int n = nums.size() - 1;
        
        for(int i = 0; i < n - 1; ++i){
            if (i > 0 && nums[i] == nums[i-1]) continue;
            
            int l = i + 1;
            int r = n;
            
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                
                if (sum == 0) {
                    ret.push_back(vector<int>{nums[i], nums[l++], nums[r--]});
                    while (l < r && nums[l] == nums[l-1]) ++l;
                    while (l < r && nums[r] == nums[r+1]) r--;
                }
                else if (sum < 0) ++l;
                else r--;
            }
        }
        return ret;
    }
};