class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        n = len(nums)
        ret = 0
        
        for num in nums:
            ret |= num

        return ret * (1 << (n - 1))
