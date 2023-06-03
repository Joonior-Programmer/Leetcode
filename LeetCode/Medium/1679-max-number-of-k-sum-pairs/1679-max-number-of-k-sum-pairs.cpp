class Solution {
public:
    int maxOperations(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        int i = 0;
        int j = nums.size() - 1;
        int ret = 0;
        
        while (i < j){
            int temp = nums[i] + nums[j];
            if (temp == k){
                ++ret;
                ++i;
                j--;
            } else if (temp < k) ++i;
            else j--;
        }
        
        return ret;
    }
};