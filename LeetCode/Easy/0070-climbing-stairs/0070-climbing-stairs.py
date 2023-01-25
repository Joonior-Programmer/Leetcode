class Solution:
    def climbStairs(self, n: int) -> int:
        pib = [1, 2]
        for i in range(2, n):
            pib.append(pib[i-2] + pib[i-1])
        return pib[n-1]