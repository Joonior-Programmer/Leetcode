class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        first, second = float("inf"), float("inf")

        for price in prices:
            if price <= first:
                second = first
                first = price
            elif price <= second:
                second = price
        
        if first + second > money:
            return money

        return money - first - second