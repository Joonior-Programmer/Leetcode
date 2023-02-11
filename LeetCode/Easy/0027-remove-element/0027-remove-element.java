class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;
        for (int i = r; i > -1; i--){
            if (nums[i] == val){
                r--;
            } else {
                break;
            }
        }

        while (l < r){
            if (nums[l] == val){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                r--;
            }
            while (r > -1 && nums[r] == val){
                r--;
            }
            l++;
        }
        return r + 1;
    }
}