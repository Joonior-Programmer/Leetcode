class Solution {
    public int thirdMax(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < nums.length; ++i){
        //     set.add(nums[i]);
        // }
        // if (set.size() < 3) return Collections.max(set);
        // int[] ret = new int[set.size()];
        // int i = 0;
        // for (int v : set){
        //     ret[i] = v;
        //     ++i;
        // }
        // Arrays.sort(ret);
        // return ret[ret.length-3];
        
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; ++i){
            if (first < nums[i]){
                third = second;
                second = first;
                first = nums[i];
            } else if (second < nums[i] && nums[i] != first){
                third = second;
                second = nums[i];
            } else if (third < nums[i] && nums[i] != second && nums[i] != first){
                third = nums[i];
            }
        }
        return third == Long.MIN_VALUE ? (int) first : (int)third;
    }
}