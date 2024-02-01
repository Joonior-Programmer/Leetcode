class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ret = new int[nums.length / 3][3];
        int[] count = new int[100001];
        int j = 1;
        
        for (int i = 0; i < nums.length; ++i) ++count[nums[i]];
        
        for (int i = 0; i < nums.length / 3; ++i){
            while (count[j] < 1) ++j;
            
            int l = 0;
            
            while (l < 3){
                if (count[j] > 0) {
                    ret[i][l++] = j;
                    count[j]--;
                }
                else ++j;
            }

            if (ret[i][2] - ret[i][0] > k) return new int[0][0];
        }
        
        return ret;
    }
}