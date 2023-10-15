class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid = 0;
        int lVal = nums.length, rVal = -1;
        
        while (l <= r){
            mid = (l + r) / 2;
            
            if (nums[mid] == target) lVal = Math.min(lVal, mid);

            if (nums[mid] >= target) r = mid - 1;
            else l = mid + 1;
        }

        l = lVal;
        r = nums.length - 1;

        while (l <= r){
            mid = (l + r) / 2;
            
            if (nums[mid] == target) rVal = Math.max(rVal, mid);

            if (nums[mid] <= target) l = mid + 1;
            else r = mid - 1;
        }

        if (lVal == nums.length) lVal = -1;
        if (rVal == -1) rVal = -1;

        int[] ret = {lVal, rVal};

        return ret;
    }
}