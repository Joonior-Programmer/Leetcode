class Solution:
    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        ret = float("inf")
        
        for i, v in enumerate(nums):
            if v == target:
                ret = min(ret, abs(i - start))
                
        return ret