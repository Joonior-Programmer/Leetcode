class neighborSum:

    def __init__(self, grid: List[List[int]]):
        self.grid = grid
        self.coord = {}
        self.n = len(grid) - 1

        for row in range(self.n + 1):
            for col in range(self.n + 1):
                self.coord[grid[row][col]] = (row, col)

    def adjacentSum(self, value: int) -> int:
        ret = 0
        row, col = self.coord[value]

        if row > 0:
            ret += self.grid[row-1][col]
        if row < self.n:
            ret += self.grid[row+1][col]
        if col > 0:
            ret += self.grid[row][col-1]
        if col < self.n:
            ret += self.grid[row][col+1]
        
        return ret

    def diagonalSum(self, value: int) -> int:
        ret = 0
        row, col = self.coord[value]

        if row > 0:
            if col > 0:
                ret += self.grid[row-1][col-1]
            if col < self.n:
                ret += self.grid[row-1][col+1]
        if row < self.n:
            if col > 0:
                ret += self.grid[row+1][col-1]
            if col < self.n:
                ret += self.grid[row+1][col+1]
        return ret


# Your neighborSum object will be instantiated and called as such:
# obj = neighborSum(grid)
# param_1 = obj.adjacentSum(value)
# param_2 = obj.diagonalSum(value)