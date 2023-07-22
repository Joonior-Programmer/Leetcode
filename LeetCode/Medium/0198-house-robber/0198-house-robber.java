class Solution {
    public int rob(int[] nums) {
        int curr1 = 0;
        int curr2 = 0;
        
        for (int i = 0; i < nums.length; ++i){
            int temp = Math.max(curr1 + nums[i], curr2);
            curr1 = curr2;
            curr2 = temp;
        }
        
        return Math.max(curr1, curr2);
    }
}