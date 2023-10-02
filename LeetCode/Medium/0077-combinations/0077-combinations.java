class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ret = new ArrayList();
        helper(new ArrayList(), 1, n, k, ret);
        return ret;
    }
    
    private void helper(List<Integer> curr, int val, int n, int k, List<List<Integer>> ret){
        if (k == 0){
            ret.add(new ArrayList(curr));
            return;
        }
        
       for (int i = val; i <= n - k + 1; ++i){
           curr.add(i);
           helper(curr, i + 1, n, k - 1, ret);
           curr.remove(curr.size()-1);
       }
    }
}