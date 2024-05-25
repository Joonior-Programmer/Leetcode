class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:
        copyX = x
        ret = 0
        
        while copyX > 0:
            ret += copyX % 10
            copyX //= 10
        
        if x % ret != 0:
            return -1
        
        return ret