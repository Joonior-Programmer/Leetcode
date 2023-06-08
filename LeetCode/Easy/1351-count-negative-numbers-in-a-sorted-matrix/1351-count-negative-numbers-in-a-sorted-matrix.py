class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        end = len(grid[0])
        ret = 0
        
        for row in grid:
            i, j = 0, end - 1
            while i <= j:
                mid = (i + j) // 2
                if row[mid] > -1:
                    i = mid + 1
                else:
                    j = mid - 1

            ret += (end - i)

        return ret