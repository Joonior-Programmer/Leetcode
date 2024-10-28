class Solution:
    def longestSquareStreak(self, nums: List[int]) -> int:
        num_set = set(nums)
        nums = sorted(num_set)
        ret = 0
        
        for v in nums:
            curr = v
            seen = set()
            temp = 0

            while curr in num_set:
                curr **= 2
                temp += 1
            
            ret = max(ret, temp)
        
        if ret < 2:
            return -1
        return ret
        
        