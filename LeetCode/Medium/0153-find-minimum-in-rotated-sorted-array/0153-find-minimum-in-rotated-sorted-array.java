class Solution {
    public int findMin(int[] nums) {
        if (nums.length < 3) return Math.min(nums[0], nums[nums.length - 1]);
        
        int l = 0, r = nums.length - 1, ret = nums[0], mid = 0;
        
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
}