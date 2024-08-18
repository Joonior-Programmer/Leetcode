class Solution:
    def nthUglyNumber(self, n: int) -> int:
        dp = [0] * n
        dp[0] = 1

        p2, p3, p5 = 0, 0, 0

        for i in range(1, n):
            p2Val = dp[p2] * 2
            p3Val = dp[p3] * 3
            p5Val = dp[p5] * 5

            target = min(p2Val, p3Val, p5Val)
            dp[i] = target

            if target == p2Val: p2 += 1
            if target == p3Val: p3 += 1
            if target == p5Val: p5 += 1

        return dp[n-1]