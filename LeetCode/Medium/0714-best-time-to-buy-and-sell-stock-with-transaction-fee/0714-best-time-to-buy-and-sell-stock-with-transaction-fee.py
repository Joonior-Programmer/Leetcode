class Solution:
    def maxProfit(self, prices: List[int], fee: int) -> int:
        effective_buy_price = prices[0]
        ret = 0

        for i in range(1, len(prices)):
            ret = max(ret, prices[i] - effective_buy_price - fee)
            effective_buy_price = min(effective_buy_price, prices[i] - ret)
            
        return ret