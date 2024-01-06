class Solution:
    def findGCD(self, nums: List[int]) -> int:
        a, b = min(nums), max(nums)

        while b != 0:
            t = b
            b = a % b
            a = t
        
        return a