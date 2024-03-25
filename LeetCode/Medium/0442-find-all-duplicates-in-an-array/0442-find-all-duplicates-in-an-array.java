class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length + 1;
        List<Integer> ret = new ArrayList();
        boolean[] exist = new boolean[n+1];
        
        for (int v : nums){
            if (exist[v]) ret.add(v);
            else exist[v] = true;
        }
         
        return ret;
    }
}