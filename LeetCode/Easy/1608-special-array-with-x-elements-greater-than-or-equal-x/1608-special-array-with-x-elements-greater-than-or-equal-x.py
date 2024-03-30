class Solution:
    def specialArray(self, nums: List[int]) -> int:
        count = [0] * 1001
        
        for num in nums:
            count[num] += 1
        
        for i in range(999, -1, -1):
            count[i] += count[i+1]
            
            if count[i] == i:
                return i
        
        return -1