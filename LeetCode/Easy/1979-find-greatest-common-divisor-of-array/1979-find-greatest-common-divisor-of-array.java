class Solution {
    public int findGCD(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; ++i){
            int temp = nums[i];
            a = Math.min(a, temp);
            b = Math.max(b, temp);
        }
        
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}