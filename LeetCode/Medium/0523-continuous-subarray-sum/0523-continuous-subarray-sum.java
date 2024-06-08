class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> exist = new HashMap();
        exist.put(0, -1);
        int curr = 0;
        
        for (int i = 0; i < nums.length; ++i){
            curr = (curr + nums[i]) % k;
            
            if (!exist.containsKey(curr)) exist.put(curr, i);
            else if (i - exist.get(curr) > 1) return true;
        }
        
        return false;
    }
}