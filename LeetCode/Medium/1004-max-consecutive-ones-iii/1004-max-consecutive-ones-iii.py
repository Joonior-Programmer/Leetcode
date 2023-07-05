class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        l = 0

        for num in nums:
            k -= 1 - num
            if k < 0:
                k += 1 - nums[l]
                l += 1
    
        return len(nums) - l