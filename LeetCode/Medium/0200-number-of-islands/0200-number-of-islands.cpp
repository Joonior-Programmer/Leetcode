class Solution {
public:
    int numIslands(vector<vector<char>>& grid) {
        int ret = 0;
        
        for (int row = 0; row < grid.size(); ++row){
            for (int col = 0; col < grid[0].size(); ++col){
                if (grid[row][col] == '1'){
                    ++ret;
                    dfs(row, col, grid);
                }
            }
        }
        
        return ret;
    }
    
    void dfs(int row, int col, vector<vector<char>>& grid){
        grid[row][col] = 0;
        
        if (row > 0 && grid[row-1][col] == '1') dfs(row - 1, col, grid);
        if (row < grid.size() - 1 && grid[row+1][col] == '1') dfs(row + 1, col, grid);
        if (col > 0 && grid[row][col-1] == '1') dfs(row, col - 1, grid);
        if (col < grid[0].size() - 1 && grid[row][col+1] == '1') dfs(row, col + 1, grid);
    }
};