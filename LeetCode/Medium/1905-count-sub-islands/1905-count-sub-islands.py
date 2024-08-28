class Solution:
    def countSubIslands(self, grid1: List[List[int]], grid2: List[List[int]]) -> int:
        ret = 0
        row_len = len(grid1) - 1
        col_len = len(grid1[0]) - 1
        
        def dfs(row, col):
            if not grid1[row][col] and grid2[row][col]:
                return False

            if not grid2[row][col]:
                grid2[row][col] = 0
                return True

            grid2[row][col] = 0

            l,r,u,d = True, True, True, True

            if row < row_len:
                r = dfs(row + 1, col)
            if row > 0:
                l = dfs(row - 1, col)
            if col < col_len:
                u = dfs(row, col + 1)
            if col > 0:
                d = dfs(row, col - 1)
        
            return l and r and u and d

        for r in range(row_len + 1):
            for c in range(col_len + 1):
                if grid1[r][c] and grid2[r][c]:
                    if dfs(r, c):
                        ret += 1
        
        return ret
            
                