class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        def dfs(n, k):
            if n == 1:
                return "0"
            
            length = 2 ** n - 1
            mid = 2 ** (n - 1)

            if k == mid:
                return "1"
            elif k < mid:
                return dfs(n-1, k)
            else:
                return "1" if dfs(n-1, length - k + 1) == "0" else "0"

        return dfs(n, k)