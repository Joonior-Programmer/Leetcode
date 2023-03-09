class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        sum_num = sum(nums)
        original_sum = sum(range(len(nums) + 1))
        return original_sum - sum_num