class Solution:
    def returnToBoundaryCount(self, nums: List[int]) -> int:
        curr = 0
        ret = 0

        for v in nums:
            curr += v
            if curr == 0:
                ret += 1
        
        return ret