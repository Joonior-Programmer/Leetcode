class Solution {
    public int arrayPairSum(int[] nums) {
        countingSort(nums);
        int ret = 0;
        for (int i = 0; i < nums.length; i = i + 2) ret += nums[i];
        return ret;
    }
    
    private void countingSort(int[] nums){
        int[] temp = new int[20001];
        int idx = 0;
        for (int i = 0; i < nums.length; ++i) ++temp[nums[i]+10000];
        
        for (int i = 0; i < 20001; ++i){
            for (int j = 0; j < temp[i]; ++j) nums[idx++] = i-10000;
        }

    }
}