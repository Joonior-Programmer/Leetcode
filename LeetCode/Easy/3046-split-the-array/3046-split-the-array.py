class Solution:
    def isPossibleToSplit(self, nums: List[int]) -> bool:
        count = [0] * 101
        
        for v in nums:
            if count[v] == 2:
                return False
            count[v] += 1
        
        return True