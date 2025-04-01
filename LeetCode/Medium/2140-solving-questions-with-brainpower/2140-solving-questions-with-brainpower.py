class Solution:
    def mostPoints(self, questions: List[List[int]]) -> int:
        n = len(questions)
        dp = [[0,0] for i in range(n+1)] 

        for i in range(n-1, -1, -1):
            point, bp = questions[i]
        
            
            dp[i][1] = point + max(dp[min(bp+i+1, n)][0], dp[min(bp+i+1, n)][1])
            dp[i][0] = max(dp[i+1][0], dp[i+1][1])
        
        # print(dp)

        return max(dp[0][0], dp[0][1])

        # skip, no skip
        # [92,65+21],[92,92+65],[74, 74+65],[65, 39],[65,58+65],[65, 5],[65, 49],[65, 65]
        # [],[],[4,],[2, 2],[0,0]