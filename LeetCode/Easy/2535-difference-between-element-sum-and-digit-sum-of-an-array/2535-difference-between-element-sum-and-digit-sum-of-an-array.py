class Solution:
    def differenceOfSum(self, nums: List[int]) -> int:
        a1 = 0
        a2 = 0

        for v in nums:
            a1 += v
            while v > 0:
                a2 += v % 10
                v //= 10
            
        return a1 - a2