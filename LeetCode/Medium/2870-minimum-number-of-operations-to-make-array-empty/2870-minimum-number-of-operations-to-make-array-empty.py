class Solution:
    def minOperations(self, nums: List[int]) -> int:
        ret = 0
        count = Counter(nums)
        
        for v in count.values():
            if v == 1:
                return -1
            ret += v // 3
            
            if v % 3:
                ret += 1
        
        return ret
            
        