class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int temp;
        for (int i = 0; i < nums.length; ++i){
            temp = nums[i];
            if (first >= temp) first = temp;
            else if (second >= temp) second = temp;
            else return true;
        }
        return false;
    }
}