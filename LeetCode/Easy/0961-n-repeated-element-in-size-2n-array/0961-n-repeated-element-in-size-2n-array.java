class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        boolean[] exist = new boolean[10001];
        
        for (int v : nums){
            if (exist[v]) return v;
            exist[v] = true;
        }
        
        return -1;
    }
}