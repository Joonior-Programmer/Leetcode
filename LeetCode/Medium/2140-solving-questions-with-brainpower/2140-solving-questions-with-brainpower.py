class Solution:
    def mostPoints(self, questions: List[List[int]]) -> int:
        n = len(questions)
        dp = [0] * (n + 1) 

        for i in range(n-1, -1, -1):
            point, bp = questions[i]
            dp[i] = max(dp[i+1], dp[min(bp + i + 1, n)] + point)
        
        return max(dp)