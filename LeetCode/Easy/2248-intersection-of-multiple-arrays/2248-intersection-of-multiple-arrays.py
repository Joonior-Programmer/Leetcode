class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        ret = set([i for i in range(1, 1001)])
        
        for v in nums:
            ret = ret & set(v)
        
        return sorted(list(ret))