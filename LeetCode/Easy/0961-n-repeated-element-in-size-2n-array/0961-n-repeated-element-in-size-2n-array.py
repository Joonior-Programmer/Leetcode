class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        n = len(nums)
        exist = [False] * 10001

        for v in nums:
            if exist[v]:
                return v
            exist[v] = True
        
        return -1