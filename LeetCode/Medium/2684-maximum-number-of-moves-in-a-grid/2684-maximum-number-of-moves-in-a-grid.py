class Solution:
    def maxMoves(self, grid: List[List[int]]) -> int:
        ret = 0
        row_len = len(grid)
        col_len = len(grid[0])
        
        prev = [True] * row_len

        for col in range(1, col_len):
            curr = [False] * row_len

            for row in range(row_len):
                if row and grid[row-1][col-1] < grid[row][col]:
                    curr[row] |= prev[row-1]
                if row < row_len - 1 and grid[row+1][col-1] < grid[row][col]:
                    curr[row] |= prev[row+1]
                if grid[row][col-1] < grid[row][col]:
                    curr[row] |= prev[row]

            if not sum(curr):
                return col - 1
            
            prev = curr

        return col_len - 1