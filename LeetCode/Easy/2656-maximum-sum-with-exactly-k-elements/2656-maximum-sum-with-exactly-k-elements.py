class Solution:
    def maximizeSum(self, nums: List[int], k: int) -> int:
        ret = 0
        curr = max(nums)
        
        while k:
            ret += curr
            curr += 1
            k -= 1
        
        return ret