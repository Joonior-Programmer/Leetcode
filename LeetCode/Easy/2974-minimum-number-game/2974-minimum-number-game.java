class Solution {
    public int[] numberGame(int[] nums) {
        int[] count = new int[101];
        int i = 1;
        int idx = 0;
        
        for (int v : nums) ++count[v];
        
        while (i < 101){
            while (i < 101 && count[i] < 1) ++i;
            if (i > 100) break;
            nums[idx+1] = i;
            count[i]--;
            
            while (i < 101 && count[i] < 1) ++i;
            if (i > 100) break;
            nums[idx] = i;
            count[i]--;
            
            idx += 2;
        }
        
        return nums;
    }
}