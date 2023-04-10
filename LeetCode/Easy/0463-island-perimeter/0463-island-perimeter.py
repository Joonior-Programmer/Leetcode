class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        ret = 0
        r = len(grid) - 1
        c = len(grid[0]) - 1
        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col] != 1:
                    continue
                ret += 4
                if row > 0 and grid[row - 1][col] == 1:
                    ret -= 2
                if col > 0 and grid[row][col - 1] == 1:
                    ret -= 2
        return ret