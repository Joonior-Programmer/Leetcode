class Solution:
    def minFallingPathSum(self, grid: List[List[int]]) -> int:
        row_len = len(grid)
        col_len = len(grid[0])

        if col_len == 1:
            return grid[0][0]

        for row in range(row_len-1, 0, -1):
            first, second = float("inf"), float("inf")
            idx = 0
            for col in range(col_len):
                temp = grid[row][col]
                if temp < first:
                    idx = col
                    second = first
                    first = temp
                elif temp < second:
                    second = temp
            
            for col in range(col_len):
                if idx == col:
                    grid[row-1][col] += second
                else:
                    grid[row-1][col] += first

        return min(grid[0])