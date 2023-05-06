class Solution {
    public int numSubseq(int[] nums, int target) {
        int ret = 0;
        int mod = 1000000007;
        int[] vals = new int[nums.length];
        vals[0] = 1;

        for (int i = 1; i < nums.length; ++i){
            vals[i] = vals[i-1] * 2 % mod;
        }
        
        Arrays.sort(nums);

        int l = 0;
        int r = nums.length - 1;
        
        while (l <= r) {
            if (nums[l] + nums[r] > target) r--;
            else {
                ret = (ret + vals[r - l++]) % mod;
            }
        }
        
        return ret;
    }
}