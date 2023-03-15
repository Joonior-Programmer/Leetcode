class NumArray {
    private ArrayList<Integer> sumArray = new ArrayList<>();
    public NumArray(int[] nums) {
        sumArray.add(nums[0]);
        for(int i = 1; i < nums.length; ++i){
            sumArray.add(sumArray.get(i-1) + nums[i]);
        }
    }
    
    public int sumRange(int left, int right) {
        int ret = sumArray.get(right);
        if (left != 0) ret -= sumArray.get(left - 1);
        return ret;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */