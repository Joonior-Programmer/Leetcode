class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        ret = []
        exist = [False] * (len(nums) + 1)
        
        for v in nums:
            if exist[v]:
                ret.append(v)
            else:
                exist[v] = True
        
        return ret