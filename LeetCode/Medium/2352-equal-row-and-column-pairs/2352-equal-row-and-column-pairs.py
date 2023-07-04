class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        exist = Counter([tuple(r) for r in grid])
        ret = 0
        
        for c in zip(*grid):
            ret += exist[c]

        return ret