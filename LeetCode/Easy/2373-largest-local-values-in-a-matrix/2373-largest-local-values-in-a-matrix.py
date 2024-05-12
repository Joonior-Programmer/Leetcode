class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        n = len(grid)

        ret = [[0] * (n - 2) for i in range(n - 2)]
        
        for row in range(1, n - 1):
            for col in range(1, n-1):
                ret[row-1][col-1] = \
                max(grid[row-1][col-1], grid[row-1][col], grid[row-1][col+1], 
                     grid[row][col-1], grid[row][col], grid[row][col+1],
                     grid[row+1][col-1], grid[row+1][col], grid[row+1][col+1])
        
        return ret