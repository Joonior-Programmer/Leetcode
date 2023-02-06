class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] front = Arrays.copyOfRange(nums, 0, n);
        int[] back = Arrays.copyOfRange(nums, n, nums.length);
        int[] ret = new int[n*2];
        for(int i = 0; i < n; ++i){
            ret[i * 2] = front[i];
            ret[i * 2 + 1] = back[i];
        }
        
        return ret;
    }
}