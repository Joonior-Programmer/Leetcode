class Solution:
    def shiftGrid(self, grid: List[List[int]], k: int) -> List[List[int]]:
        row_len = len(grid)
        col_len = len(grid[0])
        total = row_len * col_len
        vals = [0] * total
        
        i = 0
        
        for row in grid:
            for v in row:
                vals[i] = v
                i += 1
        
        i -= k
        i %= total

        for row in range(row_len):
            for col in range(col_len):
                grid[row][col] = vals[i]
                i += 1
                
                if i >= total:
                    i = 0
        
        return grid