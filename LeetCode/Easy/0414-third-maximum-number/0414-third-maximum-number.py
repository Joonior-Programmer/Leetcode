class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        nums = set(nums)
        if len(nums) < 3:
            return max(nums)
        ret = []
        for num in nums:
            ret.append(num)
        ret.sort()
        return ret[-3]
