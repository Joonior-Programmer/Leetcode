class Solution {
    List<Integer> ret;
    int n;
    
    public List<Integer> lexicalOrder(int n) {
        ret = new ArrayList();
        this.n = n;
        dfs(1);
        
        return ret;
    }
    
    private void dfs(int curr){
        if (curr > n) return;
        
        ret.add(curr);
        dfs(curr * 10);
        
        if (curr % 10 != 9) dfs(curr + 1);
    }
}