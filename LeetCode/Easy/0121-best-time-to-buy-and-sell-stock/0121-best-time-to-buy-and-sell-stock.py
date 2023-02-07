class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        min_val = prices[0]
        for i in range(1, len(prices)):
            if min_val > prices[i]:
                min_val = prices[i]
                continue
            profit = max(profit, prices[i] - min_val)
        return profit