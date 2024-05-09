class Solution {
public:
    int deleteGreatestValue(vector<vector<int>>& grid) {
        int ret = 0;
        int n = grid.size();
        
        for (int i = 0; i < n; ++i) sort(grid[i].begin(), grid[i].end());
        
        int col = grid[0].size() - 1;
        
        while (col > -1){
            int temp = grid[0][col];
            
            for (int row = 1; row < n; ++row) temp = max(temp, grid[row][col]);
            
            ret += temp;
            col--;
        }
        
        return ret;
    }
};