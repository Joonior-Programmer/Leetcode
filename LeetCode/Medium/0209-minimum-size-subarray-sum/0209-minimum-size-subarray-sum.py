class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        l, r, n = 0, 0, len(nums)
        temp = nums[0]
        ret = float("inf")

        while r < n:
            if temp >= target:
                ret = min(ret, r - l + 1)
                temp -= nums[l]
                l += 1
            elif temp > target:
                temp -= nums[l]
                l += 1
            else:
                r += 1
                if r < n:
                    temp += nums[r]
        
        if ret == float("inf"):
            return 0

        return ret
        