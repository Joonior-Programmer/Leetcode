class Solution:
    def getMaximumGold(self, grid: List[List[int]]) -> int:
        row_len = len(grid) - 1
        col_len = len(grid[0]) - 1
        visited = [[False] * (col_len + 1) for i in range(row_len + 1)]
        ret = 0
        
        def dfs(row, col, curr):
            if grid[row][col] == 0 or visited[row][col]:
                return curr
            
            curr += grid[row][col]
            temp = curr
            visited[row][col] = True
            
            if row > 0:
                temp = max(temp, dfs(row-1, col, curr))
            if row < row_len:
                temp = max(temp, dfs(row+1, col, curr))
            if col > 0:
                temp = max(temp, dfs(row, col-1, curr))
            if col < col_len:
                temp = max(temp, dfs(row, col+1, curr))
            
            curr = temp

            visited[row][col] = False
            
            return curr
        
        for i in range(row_len+1):
            for j in range(col_len+1):
                ret = max(ret, dfs(i,j,0))
        
        return ret