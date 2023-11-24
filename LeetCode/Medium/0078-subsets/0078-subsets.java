class Solution {
    List<List<Integer>> ret;
    int[] nums;
    int n;
    
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        ret = new ArrayList();
        this.nums = nums;
        dfs(0, new ArrayList());
        
        return ret;
    }
    
    private void dfs(int idx, ArrayList<Integer> curr){
        if (idx > n) return;
        
        ret.add(new ArrayList(curr));
        
        for (int i = idx; i < n; ++i){
            curr.add(nums[i]);
            dfs(i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
}