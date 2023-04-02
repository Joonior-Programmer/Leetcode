class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i){
            set.add(nums[i]);
        }
        if (set.size() < 3) return Collections.max(set);
        int[] ret = new int[set.size()];
        int i = 0;
        for (int v : set){
            ret[i] = v;
            ++i;
        }
        Arrays.sort(ret);
        return ret[ret.length-3];
    }
}