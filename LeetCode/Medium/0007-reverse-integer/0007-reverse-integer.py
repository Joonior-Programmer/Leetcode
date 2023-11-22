class Solution:
    def reverse(self, x: int) -> int:
        if not x:
            return 0

        minus = x < 0
        ret = 0
        
        if minus:
            x *= -1
        
        while x % 10 == 0:
            x //= 10
        
        while x:
            ret = ret * 10 + x % 10
            x //= 10
        
        if minus:
            ret *= -1
        
        if ret < -2 ** 31 or ret > 2 ** 31 - 1:
            return 0

        return ret
            
        
            
        
        
            