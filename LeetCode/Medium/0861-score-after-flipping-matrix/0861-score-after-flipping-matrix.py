class Solution:
    def matrixScore(self, grid: List[List[int]]) -> int:
        row_len = len(grid)
        col_len = len(grid[0])
        ret = 0
        
        for row in grid:
            if row[0] == 0:
                row[0] = 1
                for col in range(1, col_len):
                    if row[col] == 0:
                        row[col] = 1
                    else:
                        row[col] = 0
        
        for col in range(col_len):
            count = 0
            for row in range(row_len):
                if grid[row][col] == 0:
                    count += 1
            
            if count > row_len // 2:
                for row in range(row_len):
                    if grid[row][col] == 0:
                        grid[row][col] = 1
                    else:
                        grid[row][col] = 0
        
        for row in grid:
            temp = 0
            for v in row:
                temp = temp * 2 + v
            
            ret += temp
            
        return ret
        