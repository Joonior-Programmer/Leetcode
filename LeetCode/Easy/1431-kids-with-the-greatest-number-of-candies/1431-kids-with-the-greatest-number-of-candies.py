class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        max_candy = max(candies) - extraCandies
        return [max_candy - candy < 1 for candy in candies]