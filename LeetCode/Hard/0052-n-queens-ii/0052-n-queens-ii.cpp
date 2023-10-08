class Solution {
public:
    int totalNQueens(int n) {
        vector<bool> col(n, false);
        unordered_set<int> lDiag;
        unordered_set<int> rDiag;
        
        return dfs(0, col, lDiag, rDiag, n);
    }
    
    int dfs(int row, vector<bool>& col, unordered_set<int>& lDiag, unordered_set<int>& rDiag, int n) {
        int ret = 0;
        
        for (int i = 0; i < n; ++i){
            int l = i + row;
            int r = i - row;
            
            if (!col[i] && lDiag.find(l) == lDiag.end() && rDiag.find(r) == rDiag.end()){
                if (row == n - 1) return 1;
                
                col[i] = true;
                lDiag.insert(l);
                rDiag.insert(r);
                ret += dfs(row+1, col, lDiag, rDiag, n);
                col[i] = false;
                lDiag.erase(l);
                rDiag.erase(r);
            }
        }
        
        return ret;
    }
};