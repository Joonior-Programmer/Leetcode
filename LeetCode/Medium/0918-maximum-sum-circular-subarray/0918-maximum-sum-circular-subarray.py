class Solution:
    def maxSubarraySumCircular(self, nums: List[int]) -> int:

        curr_max = nums[0]
        global_max = nums[0]
        curr_min = nums[0]
        global_min = nums[0]

        for v in nums[1:]:
            curr_max = max(curr_max + v, v)
            global_max = max(global_max, curr_max)

            curr_min = min(curr_min + v, v)
            global_min = min(global_min ,curr_min)
            

        if global_max < 0: return global_max

        return max(global_max, sum(nums) - global_min)