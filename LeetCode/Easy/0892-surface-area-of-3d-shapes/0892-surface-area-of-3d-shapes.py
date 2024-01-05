class Solution:
    def surfaceArea(self, grid: List[List[int]]) -> int:
        if len(grid) == 1:
            return grid[0][0] * 4 + 2
        
        n = len(grid)
        
        ret = 0

        if grid[0][0]:
            ret += grid[0][0] * 4 + 2
        

        for i in range(1, n):
            if grid[0][i]:
                ret += grid[0][i] * 4 + 2 - min(grid[0][i], grid[0][i-1]) * 2
            if grid[i][0]:
                ret += grid[i][0] * 4 + 2 - min(grid[i][0], grid[i-1][0]) * 2
        
        for i in range(1, n):
            for j in range(1, n):
                if grid[i][j]:
                    ret += grid[i][j] * 4 + 2 - \
                        (min(grid[i][j], grid[i-1][j]) + \
                            min(grid[i][j], grid[i][j-1])) * 2
        
        return ret
        
        
        