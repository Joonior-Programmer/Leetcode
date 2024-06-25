class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        count = [0] * 101
        i = 1
        idx = 0
        
        for v in nums:
            count[v] += 1
        
        while i < 101:
            while i < 101 and count[i] < 1: i += 1
            
            if i > 100: break
                
            nums[idx+1] = i
            count[i] -= 1
            
            while i < 101 and count[i] < 1: i += 1
            if i > 100: break
            nums[idx] = i
            count[i] -= 1
            
            idx += 2
        
        return nums