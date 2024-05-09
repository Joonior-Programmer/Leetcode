class Solution:
    def deleteGreatestValue(self, grid: List[List[int]]) -> int:
        ret = 0
        
        for v in grid:
            v.sort()
            
        while len(grid[0]) > 0:
            temp = 0
            
            for v in grid:
                temp = max(temp, v.pop())
            
            ret += temp
        
        return ret