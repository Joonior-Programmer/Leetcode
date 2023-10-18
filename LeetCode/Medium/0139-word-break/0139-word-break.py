class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        n = len(s)
        dp = [False] * (n + 1)
        dp[n] = True

        for i in range(n - 1, -1, -1):
            for v in wordDict:
                if i + len(v) <= n and s[i: i + len(v)] == v:
                    dp[i] = dp[i + len(v)]
                if dp[i]:
                    break
        
        return dp[0]