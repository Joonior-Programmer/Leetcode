class Solution {
public:
    int rowLen;
    int colLen;
    
    int getMaximumGold(vector<vector<int>>& grid) {
        rowLen = grid.size() - 1;
        colLen = grid[0].size() - 1;
        vector<vector<bool>> visited(rowLen + 1, vector<bool>(colLen + 1));
        int ret = 0;
        
        for (int i = 0; i < rowLen + 1; ++i)
            for (int j = 0; j < colLen + 1; ++j)
                ret = max(ret, dfs(i,j,0, grid, visited));
        
        return ret;
    }
    
    int dfs(int row, int col, int curr, vector<vector<int>>& grid, vector<vector<bool>>& visited ){
        if (grid[row][col] == 0 || visited[row][col])
            return curr;

        curr += grid[row][col];
        int temp = curr;
        visited[row][col] = true;

        if (row > 0)
            temp = max(temp, dfs(row-1, col, curr, grid, visited));
        if (row < rowLen)
            temp = max(temp, dfs(row+1, col, curr, grid, visited));
        if (col > 0)
            temp = max(temp, dfs(row, col-1, curr, grid, visited));
        if (col < colLen)
            temp = max(temp, dfs(row, col+1, curr, grid, visited));

        curr = temp;

        visited[row][col] = false;

        return curr;
    }
};