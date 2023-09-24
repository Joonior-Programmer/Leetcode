class Solution {
    public int numIslands(char[][] grid) {
        int ret = 0;
        
        for (int row = 0; row < grid.length; ++row){
            for (int col = 0; col < grid[0].length; ++col){
                if (grid[row][col] == '1'){
                    ++ret;
                    dfs(row, col, grid);
                }
            }
        }
        
        return ret;
    }
    
    private void dfs(int row, int col, char[][] grid){
        grid[row][col] = '0';
        
        if (row > 0 && grid[row-1][col] == '1') dfs(row-1, col, grid);
        if (row < grid.length - 1 && grid[row+1][col] == '1') dfs(row+1, col, grid);
        if (col > 0 && grid[row][col-1] == '1') dfs(row, col-1, grid);
        if (col < grid[0].length - 1 && grid[row][col + 1] == '1') dfs(row, col+1, grid);
    }
}