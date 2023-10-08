class Solution {
    boolean[] col;
    HashSet<Integer> lDiag;
    HashSet<Integer> rDiag;
    int n;
    public int totalNQueens(int n) {
        this.n = n;
        col = new boolean[n];
        lDiag = new HashSet();
        rDiag = new HashSet();
        
        return dfs(0);
    }
    
    private int dfs(int row){
        int ret = 0;
        
        for (int i = 0; i < n; ++i){
            int l = i + row;
            int r = row-i;
            if (!col[i] && !lDiag.contains(l) && !rDiag.contains(r)){
                if (row == n - 1) return 1;
                col[i] = true;
                lDiag.add(l);
                rDiag.add(r);
                ret += dfs(row+1);
                col[i] = false;
                lDiag.remove(l);
                rDiag.remove(r);
            }
        }

        return ret;
    }
}