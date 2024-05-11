class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] count = new int[51];
        boolean[] checkPrefix = new boolean[51];
        
        int prefix = 0;
        int elements = 0;
        
        for (int i = 0; i < n; ++i) 
            if (count[nums[i]]++ == 0) ++elements;
        
        for (int i = 0; i < n; ++i){
            int temp = nums[i];
            if (!checkPrefix[temp]) {
                ++prefix;
                checkPrefix[temp] = true;
            }
            
            if (count[temp]-- == 1) elements--;
            
            nums[i] = prefix - elements;
        }
        
        return nums;
    }
}