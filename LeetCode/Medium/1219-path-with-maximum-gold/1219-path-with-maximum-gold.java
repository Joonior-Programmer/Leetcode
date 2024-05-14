class Solution {
    int rowLen;
    int colLen;
    boolean[][] visited;
    int[][] grid;
    
    public int getMaximumGold(int[][] grid) {
        this.grid = grid;
        rowLen = grid.length - 1;
        colLen = grid[0].length - 1;
        visited = new boolean[rowLen+1][colLen+1];
        int ret = 0;
        
        for (int i = 0; i < rowLen + 1; ++i)
            for (int j = 0; j < colLen + 1; ++j)
                ret = Math.max(ret, dfs(i,j,0));
        
        return ret;
    }
    
    private int dfs(int row, int col, int curr){
        if (grid[row][col] == 0 || visited[row][col])
            return curr;

        curr += grid[row][col];
        int temp = curr;
        visited[row][col] = true;

        if (row > 0)
            temp = Math.max(temp, dfs(row-1, col, curr));
        if (row < rowLen)
            temp = Math.max(temp, dfs(row+1, col, curr));
        if (col > 0)
            temp = Math.max(temp, dfs(row, col-1, curr));
        if (col < colLen)
            temp = Math.max(temp, dfs(row, col+1, curr));

        curr = temp;

        visited[row][col] = false;

        return curr;
    }
}