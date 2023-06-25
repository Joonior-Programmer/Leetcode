class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[] count = new int[20001];
        int ret = 0;
        for (int i = 0; i < nums.length; ++i) ++count[nums[i] + 10000];
        
        for (int i = 20000; i > -1; i--){
            if (count[i] >= k) {
                ret = i - 10000;
                break;
            } else k -= count[i];
        }
        
        return ret;
    }
}