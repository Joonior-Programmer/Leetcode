class Solution {
    public int uniquePaths(int m, int n) {
        int[] ret = new int[n];

        for (int i = 0; i < n; ++i) ret[i] = 1;

        for (int j = 1; j < m; ++j){
            for (int i = 1; i < n; ++i) ret[i] += ret[i-1];
        }
        
        return ret[n-1];
    }
}