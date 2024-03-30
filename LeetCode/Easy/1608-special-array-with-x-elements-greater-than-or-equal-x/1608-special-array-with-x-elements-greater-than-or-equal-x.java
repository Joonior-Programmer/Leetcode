class Solution {
    public int specialArray(int[] nums) {
        int[] count = new int[1001];
        
        for (int num : nums) ++count[num];
            
        
        for (int i = 999; i > -1; i--){
            count[i] += count[i+1];
            
            if (count[i] == i) return i;
        }
        
        return -1;
    }
}