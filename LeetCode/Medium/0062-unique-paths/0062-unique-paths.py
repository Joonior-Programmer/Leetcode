class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        ret = [1] * n
        
        for j in range(1, m):
            for i in range(1, n):
                ret[i] += ret[i-1]

        return ret[-1]