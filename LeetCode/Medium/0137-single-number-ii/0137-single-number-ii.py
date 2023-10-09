class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ones=0
        threes=0
        for i in nums:
            ones=(ones^i)&(~threes)
            threes=(threes^i)&(~ones)
        return ones