class Solution:
    def change(self, amount: int, coins: List[int]) -> int:
        dp = [0] * (amount + 1)
        dp[0] = 1

        for coin in coins[::-1]:
            for v in range(1, amount + 1):
                if v - coin >= 0:
                    dp[v] += dp[v-coin]

        return dp[amount]