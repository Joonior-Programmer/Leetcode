class Solution:
    def numberOfPoints(self, nums: List[List[int]]) -> int:
        count = [0] * 102
        ret = 0
        curr = 0
        
        for v0, v1 in nums:
            count[v0] += 1
            count[v1 + 1] -= 1
        
        for v in count:
            curr += v
            
            if curr:
                ret += 1
        
        return ret