class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        ret = []
        curr = 0
        
        for v in nums:
            curr += v
            ret.append(curr)
        
        return ret