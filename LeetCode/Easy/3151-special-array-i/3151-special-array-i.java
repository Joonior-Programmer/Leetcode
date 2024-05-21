class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean isOdd = true;
        
        if (nums[0] % 2 == 0) isOdd = false;
        
        for (int i = 1; i < nums.length; ++i){
            boolean temp = true;
            if (nums[i] % 2 == 0) temp = false; 
            if (temp == isOdd) return false;
            
            isOdd = !isOdd;
        }
        
        return true;
    }
}