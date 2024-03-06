class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        n = len(prices)
        ret = [0] * n

        for i in range(n):
            v = prices[i]
            for j in range(i + 1, n):
                if prices[j] <= prices[i]:
                    v -= prices[j]
                    break
                
            ret[i] = v;
        
        
        return ret