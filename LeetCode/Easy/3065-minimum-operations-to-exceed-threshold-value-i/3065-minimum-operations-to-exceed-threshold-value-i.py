class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        ret = 0
        
        for v in nums:
            if v < k:
                ret += 1
        
        return ret