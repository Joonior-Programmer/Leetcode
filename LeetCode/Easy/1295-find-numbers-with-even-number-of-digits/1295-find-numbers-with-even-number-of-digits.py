class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        ret = 0

        for num in nums:
            temp = num
            digits = 0
            
            while temp > 0:
                temp //= 10
                digits += 1

            if digits % 2 == 0: ret += 1
        
        return ret