class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        return sum(1 if v % 3 else 0 for v in nums)