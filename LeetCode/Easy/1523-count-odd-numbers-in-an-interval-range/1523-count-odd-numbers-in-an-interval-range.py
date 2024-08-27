class Solution:
    def countOdds(self, low: int, high: int) -> int:
        return (high - low) // 2 + (1 if low % 2 or high % 2 else 0)