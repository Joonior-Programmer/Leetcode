class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ret = new int[nums.length / 3][3];
        int[] count = new int[100001];
        int j = 1;
        
        for (int i = 0; i < nums.length; ++i) ++count[nums[i]];
        
        for (int i = 0; i < nums.length / 3; ++i){
            int[] temp = new int[3];
            
            while (count[j] < 1) ++j;
            
            int min = j;
            int l = 0;
            
            while (l < 3){
                if (j - min > k) return new int[0][0];
                
                if (count[j] > 0) {
                    temp[l++] = j;
                    count[j]--;
                }
                else ++j;
            }
            
            ret[i] = temp;
        }
        
        return ret;
    }
}