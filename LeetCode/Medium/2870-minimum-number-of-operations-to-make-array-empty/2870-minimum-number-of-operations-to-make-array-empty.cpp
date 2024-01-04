class Solution {
public:
    int minOperations(vector<int>& nums) {
        int ret = 0;
        int i = 0;
        sort(nums.begin(), nums.end());
        
        while (i < nums.size()){
            int count = 1;
            int curr = nums[i];
            ++i;
            while (i < nums.size() && nums[i] == curr) {
                ++count;
                ++i;
            }
            
            if (count == 1) return -1;
            
            ret += count / 3;
            if (count % 3 > 0) ++ret;
        }
        
        return ret;
    }
};