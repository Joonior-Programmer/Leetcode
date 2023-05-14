class Solution {
    public int findLHS(int[] nums) {
        // HashMap Solution
        // int ret = 0;
        // HashMap<Integer, Integer> count = new HashMap<>();
        // for (int i = 0; i < nums.length; ++i) count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        
        // for (Integer k : count.keySet()) {
        //     if (count.containsKey(k+1)) ret = Math.max(ret, count.get(k) + count.get(k+1));
        // }
        // return ret;

        int ret = 0;
        Arrays.sort(nums);
        int prev = nums[0];
        int prevCount = 0;
        int curCount = 1;
        for (int i = 1; i < nums.length; ++i){
            if (nums[i] != nums[i-1]) {
                prevCount = curCount;
                prev = nums[i-1];
                curCount = 0;
            }
            ++curCount;

            if (nums[i] - 1 == prev) {
                ++prevCount;
                ret = Math.max(ret, prevCount);
            }

        }
        return ret;
    }
}