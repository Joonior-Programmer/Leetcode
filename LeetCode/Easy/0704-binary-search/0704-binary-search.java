class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r){
            int mid = (l + r) / 2;
            int v = nums[mid];

            if (v == target)
                return mid;
            else if (v < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        
        return -1;
    }
}