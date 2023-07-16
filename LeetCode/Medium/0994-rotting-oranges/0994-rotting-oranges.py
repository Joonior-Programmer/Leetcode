class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        ret = 0
        fresh_count = 0
        rotten_count = 0
        q = []
        row_len = len(grid) - 1
        col_len = len(grid[0]) - 1

        for row in range(row_len + 1):
            for col in range(col_len + 1):
                if grid[row][col] == 2:
                    rotten_count += 1
                    q.append([row, col])
                elif grid[row][col] == 1:
                    fresh_count += 1 

        total = rotten_count + fresh_count
        
        if total == rotten_count:
            return 0
        
        while q:
            temp_q = []

            for i in range(len(q)):
                row, col = q[i][0], q[i][1]
                

                if row > 0 and grid[row-1][col] == 1:
                    rotten_count += 1
                    temp_q.append([row-1, col])
                    grid[row-1][col] = 2
                if row < row_len and grid[row+1][col] == 1:
                    rotten_count += 1
                    temp_q.append([row+1, col])
                    grid[row+1][col] = 2
                if col > 0 and grid[row][col-1] == 1:
                    rotten_count += 1
                    temp_q.append([row, col-1])
                    grid[row][col-1] = 2
                if col < col_len and grid[row][col+1] == 1:
                    rotten_count += 1
                    temp_q.append([row, col+1])
                    grid[row][col+1] = 2

            ret += 1
            if rotten_count == total:
                return ret
            q = temp_q

        return -1