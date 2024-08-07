class neighborSum {
    int[][] grid;
    int[][] coord;
    int n;
    
    public neighborSum(int[][] grid) {
        this.grid = grid;
        n = grid.length;
        coord = new int[n * n][2];
        
        for (int row = 0; row < n; ++row)
            for (int col = 0; col < n; ++col){
                int val = grid[row][col];
                coord[val][0] = row;
                coord[val][1] = col;
            }
        n--;
    }
    
    public int adjacentSum(int value) {
        int ret = 0;
        int row = coord[value][0];
        int col = coord[value][1];
        
        if (row > 0) ret += grid[row-1][col];
        if (row < n) ret += grid[row+1][col];
        if (col > 0) ret += grid[row][col-1];
        if (col < n) ret += grid[row][col+1];
        
        return ret;
    }
    
    public int diagonalSum(int value) {
        int ret = 0;
        int row = coord[value][0];
        int col = coord[value][1];
        
        if (row > 0) {
            if (col > 0) ret += grid[row-1][col-1];
            if (col < n) ret += grid[row-1][col+1];
        }
        if (row < n) {
            if (col > 0) ret += grid[row+1][col-1];
            if (col < n) ret += grid[row+1][col+1];
        }
        
        return ret;
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */