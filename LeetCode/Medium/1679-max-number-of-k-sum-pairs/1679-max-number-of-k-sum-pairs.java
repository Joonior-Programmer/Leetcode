class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int ret = 0;
        
        while (i < j){
            int temp = nums[i] + nums[j];
            if (temp == k){
                ++ret;
                ++i;
                j--;
            } else if (temp < k) ++i;
            else j--;
        }
        
        return ret;
    }
}