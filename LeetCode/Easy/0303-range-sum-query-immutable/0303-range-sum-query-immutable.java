class NumArray {
    private int[] sumArray;
    public NumArray(int[] nums) {
        sumArray = new int[nums.length];
        int prev = 0;
        for(int i = 0; i < nums.length; ++i){
            sumArray[i] = prev + nums[i];
            prev += nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int ret = sumArray[right];
        if (left != 0) ret -= sumArray[left - 1];
        return ret;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */