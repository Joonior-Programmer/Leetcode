class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        costs.sort()
        for i in range(len(costs)):
            coins -= costs[i]
            if coins < 0:
                return i
        return i + 1