class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int curr = 0;
        
        for (int i = 0; i < nums.length; ++i) ++count[nums[i]];
        
        for (int i = 0; i < 101; ++i) {
            int temp = count[i];
            count[i] = curr;
            curr += temp;
        }
        
        for (int i = 0; i < nums.length; ++i) nums[i] = count[nums[i]];
        
        return nums;
    }
}