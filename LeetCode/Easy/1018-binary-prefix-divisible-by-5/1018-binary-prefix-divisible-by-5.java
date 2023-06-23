class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ret = new ArrayList<>(nums.length);
        int sum = 0;
        
        for (int i = 0; i < nums.length; ++i){
            sum = (sum << 1 | nums[i]) % 5;
            ret.add(sum == 0);
        }
        
        return ret;
    }
}