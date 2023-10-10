class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        ret = float("-inf")
        curr = 0
        
        for v in nums:
            curr += v
            ret = max(ret, curr)
            curr = max(0, curr)
        
        return ret