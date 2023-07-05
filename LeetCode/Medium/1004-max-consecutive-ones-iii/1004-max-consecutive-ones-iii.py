class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        ret, l, r = 0, 0, 0

        while r < len(nums):
            while r < len(nums) and k:
                if nums[r] == 0:
                    k -= 1
                r += 1

            while r < len(nums) and nums[r] == 1:
                r += 1

            ret = max(ret, r - l)

            while l < len(nums) and nums[l] != 0:
                l += 1
                
            l += 1
            k += 1

        return ret