class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int l = 0, r = nums.size() - 1, mid = 0;
        int lVal = nums.size(), rVal = -1;
        
        while (l <= r){
            mid = (l + r) / 2;
            
            if (nums[mid] == target) lVal = min(lVal, mid);

            if (nums[mid] >= target) r = mid - 1;
            else l = mid + 1;
        }

        if (lVal == nums.size()) return vector<int>{-1, -1};
        
        l = lVal;
        r = nums.size() - 1;

        while (l <= r){
            mid = (l + r) / 2;
            
            if (nums[mid] == target) rVal = max(rVal, mid);

            if (nums[mid] <= target) l = mid + 1;
            else r = mid - 1;
        }

        return vector<int>{lVal, rVal};
    }
};