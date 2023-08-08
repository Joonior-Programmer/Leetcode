class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ret = 0
        effective_buy = float("inf")

        for price in prices:
            ret = max(ret, price - effective_buy)
            effective_buy = min(effective_buy, price - ret)
        
        return ret