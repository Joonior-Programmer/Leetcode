class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        ret = 0
        r = len(grid) - 1
        c = len(grid[0]) - 1
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                temp = grid[row][col]
                if temp != 1:
                    continue
                if row == 0:
                    ret += 1
                if row == r:
                    ret += 1
                if col == 0:
                    ret += 1
                if col == c:
                    ret += 1
                if row != 0 and grid[row - 1][col] != 1:
                    ret += 1
                if row != r and grid[row + 1][col] != 1:
                    ret += 1
                if col != 0 and grid[row][col - 1] != 1:
                    ret += 1
                if col != c and grid[row][col + 1] != 1:
                    ret += 1
        return ret