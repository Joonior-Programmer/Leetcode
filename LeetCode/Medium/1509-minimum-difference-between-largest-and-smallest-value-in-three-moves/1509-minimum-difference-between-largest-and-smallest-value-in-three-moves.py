class Solution:
    def minDifference(self, nums: List[int]) -> int:
        if len(nums) < 5:
            return 0

        nums.sort()

        n = len(nums)

        return min(nums[n-4] - nums[0], nums[n-3] - nums[1], 
                    nums[n-2] - nums[2], nums[n-1] - nums[3])