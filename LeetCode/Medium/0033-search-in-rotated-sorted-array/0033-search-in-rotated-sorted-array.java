class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, mid = 0;
        
        while (l < r){
            mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) l = mid + 1;
            else r = mid;
        }

        if (nums[l] <= target && target <= nums[nums.length - 1]){
            r = nums.length - 1;
        } else {
            r = l;
            l = 0;
        }

        while (l <= r){
            mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }

        return -1;
    }
}