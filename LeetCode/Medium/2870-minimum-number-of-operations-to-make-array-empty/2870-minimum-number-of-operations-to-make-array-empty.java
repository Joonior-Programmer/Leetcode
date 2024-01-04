class Solution {
    public int minOperations(int[] nums) {
        int ret = 0;
        int i = 0;
        Arrays.sort(nums);
        
        while (i < nums.length){
            int count = 1;
            int curr = nums[i];
            ++i;
            while (i < nums.length && nums[i] == curr) {
                ++count;
                ++i;
            }
            
            if (count == 1) return -1;
            
            ret += count / 3;
            if (count % 3 > 0) ++ret;
        }
        
        return ret;
    }
}