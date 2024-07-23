class Solution {
    public int[] frequencySort(int[] nums) {
        int[] count = new int[201];
        int total = nums.length;
        int n = total - 1;
        
        for (int v : nums) ++count[v+100];
        
        int idx = n;
        int curr = 100;
        
        while (total > 0){
            int v = -1;
            for (int i = 0; i < 201; ++i)
                if (count[i] == curr) {
                    v = i;
                    break;
                }
            
            if (v == -1) {
                curr--;
                continue;
            }
            
            total -= count[v];
            
            for (int i = 0; i < count[v]; ++i) nums[idx--] = v - 100;
            
            count[v] = 0;
        }
        
        return nums;
    }
}