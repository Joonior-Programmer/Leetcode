class Solution {
public:
    int findMin(vector<int>& nums) {
        if (nums.size() < 3) return min(nums[0], nums[nums.size()-1]);
        
        int l = 0, r = nums.size() - 1, mid = 0, ret = nums[0];
        
        while (l <= r){
            mid = (l + r) / 2;
            
            if (nums[mid] > ret) l = mid + 1;
            else {
                r = mid - 1;
                ret = nums[mid];
            }
        }
        
        return ret;
    }
};