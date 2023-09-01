class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set(nums)
        ret = 0
        
        for num in num_set:
            if num - 1 not in num_set:
                curr = num + 1

                while curr in num_set:
                    curr += 1
                
                ret = max(ret, curr - num)
        
        return ret