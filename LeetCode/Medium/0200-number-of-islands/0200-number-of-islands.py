class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        ret = 0
        
        def dfs(row, col):
            grid[row][col] = "0"
            
            if row > 0 and grid[row-1][col] == "1":
                dfs(row-1, col)
            if row < len(grid) - 1 and grid[row+1][col] == "1":
                dfs(row+1, col)
            if col > 0 and grid[row][col-1] == "1":
                dfs(row, col-1)
            if col < len(grid[0]) - 1 and grid[row][col + 1] == "1":
                dfs(row, col+1)
        
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col] == "1":
                    ret += 1
                    dfs(row, col)
        
        return ret