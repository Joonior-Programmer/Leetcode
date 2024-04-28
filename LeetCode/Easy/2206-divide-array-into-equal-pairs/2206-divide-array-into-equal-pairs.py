class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        count = [0] * 501
        
        for v in nums:
            count[v] += 1
        
        for i in range(1, 501):
            if count[i] % 2 == 1:
                return False
        
        return True