class Solution {
    public int minMaxGame(int[] nums) {
        if (nums.length == 1) return nums[0];

        int[] temp = new int[nums.length / 2];
        
        for (int i = 0; i < nums.length / 2; ++i){
            if (i % 2 == 0) temp[i] = Math.min(nums[i * 2], nums[i * 2 + 1]);
            else temp[i] = Math.max(nums[i * 2], nums[i * 2 + 1]);
        }
                         
        return minMaxGame(temp);
    }
}