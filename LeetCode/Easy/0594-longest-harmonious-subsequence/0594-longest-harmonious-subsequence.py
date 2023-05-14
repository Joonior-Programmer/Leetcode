class Solution:
    def findLHS(self, nums: List[int]) -> int:
        ret = 0
        count = Counter(nums)
        for k in count:
            if count[k+1]:
                ret = max(ret, count[k] + count[k+1])
            
        return ret 
        
        
