class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        count = [False] * 2001
        
        for v in nums:
            count[v+1000] = True

        for i in range(1000, 0, -1):
            if count[i+1000] and count[1000-i]:
                return i
        
        return -1