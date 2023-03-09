class Solution {
    public int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int originalSum = 0;
        for (int i = 1; i < nums.length + 1; ++i){
            originalSum += i;
        }
        return originalSum - sum;
    }
}