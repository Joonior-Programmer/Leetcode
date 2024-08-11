class Solution {
public:
    vector<vector<int>> shiftGrid(vector<vector<int>>& grid, int k) {
        int row_len = grid.size();
        int col_len = grid[0].size();
        int total = row_len * col_len;
        vector<int> vals(total);
        
        int i = 0;
        
        for (vector<int>& row : grid)
            for (int v : row){
                vals[i++] = v;
            }
        
        i -= k;
        i = (i % total + total) % total;

        for (int row = 0; row < row_len; ++row)
            for (int col = 0; col < col_len; ++col){
                grid[row][col] = vals[i++];
                
                if (i >= total) i = 0;
            }
        
        return grid;
    }
};