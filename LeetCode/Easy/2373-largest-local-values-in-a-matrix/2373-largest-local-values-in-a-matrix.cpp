class Solution {
public:
    vector<vector<int>> largestLocal(vector<vector<int>>& grid) {
        int n = grid.size();
        vector<vector<int>> ret(n-2, vector<int>(n-2));
        
        for (int i = 1; i < n - 1; ++i)
            for (int j = 1; j < n - 1; ++j){
                int max = 0;
                
                for (int idx1 = i - 1; idx1 < i + 2; ++idx1)
                    for (int idx2 = j - 1; idx2 < j + 2; ++idx2)
                        if (grid[idx1][idx2] > max) max = grid[idx1][idx2];
                
                ret[i-1][j-1] = max;
            }
        
        return ret;
    }
};