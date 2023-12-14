class Solution:
    def onesMinusZeros(self, grid: List[List[int]]) -> List[List[int]]:
        row_len = len(grid)
        col_len = len(grid[0])
        ones_row = [row.count(1) for row in grid]
        ones_col = [col.count(1) for col in zip(*grid)]

        diff = []

        for v1 in ones_row:
            temp = []
            for v2 in ones_col:
                temp.append(v1-(row_len-v1)+v2-(col_len-v2))
            diff.append(temp)

        return diff