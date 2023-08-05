class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        n = len(word1)
        m = len(word2)
        dp = [[0] * (n + 1) for i in range(m + 1)]
        
        for i in range(m):
            dp[i][-1] = m - i
        for i in range(n):
            dp[-1][i] = n - i
        
        for i in range(m-1, -1, -1):
            for j in range(n-1, -1, -1):
                if word1[j] == word2[i]:
                    dp[i][j] = dp[i+1][j+1]
                else:
                    dp[i][j] = 1 + min(dp[i+1][j], dp[i+1][j+1], dp[i][j+1])

        return dp[0][0]