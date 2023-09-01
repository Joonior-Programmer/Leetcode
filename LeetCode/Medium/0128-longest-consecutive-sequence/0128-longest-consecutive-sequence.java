class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> setNum = new HashSet();

        for (int i = 0; i < nums.length; ++i) setNum.add(nums[i]);

        int ret = 0;
        
        for (int num : nums){
            if (!setNum.contains(num-1)){
                int curr = num + 1;
                while (setNum.contains(curr)) ++curr;
                ret = Math.max(ret, curr - num);
                if (ret > nums.length / 2) break;
            }
        }
        
        return ret;
    }
}