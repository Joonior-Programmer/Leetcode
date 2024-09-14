class Solution {
    public int longestSubarray(int[] nums) {
        int ret = 1;
        int curr = 0;
        int target = 0;
        
        for (int v : nums){
            if (target < v){
                ret = 1;
                curr = 0;
                target = v;
            }
            
            if (v == target) ++curr;
            else {
                ret = Math.max(ret, curr);
                curr = 0;
            }
        }
        
        ret = Math.max(ret, curr);
        
        return ret;
    }
}