class Solution {
    StringBuilder sb;
    List<String> ret;
    int target;
    public List<String> generateParenthesis(int n) {
        sb = new StringBuilder();
        ret = new ArrayList();
        target = n * 2;
        
        dfs(0, 0);
        
        return ret;
    }
    
    private void dfs(int l, int r){
        if (l + r == target){
            ret.add(sb.toString());
            return;
        }
        
        if (l < target / 2){
            sb.append("(");
            dfs(l + 1, r);
            sb.setLength(sb.length() - 1);
        }
        
        if (r < l){
            sb.append(")");
            dfs(l, r + 1);
            sb.setLength(sb.length() - 1);
        }
    }
}