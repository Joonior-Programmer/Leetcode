class Solution:
    def multiply(self, num1: str, num2: str) -> str:
        ret1 = 0
        ret2 = 0
        
        for v in num1:
            ret1 = ret1 * 10 + ord(v) - 48
        
        for v in num2:
            ret2 = ret2 * 10 + ord(v) - 48
            
        return str(ret1 * ret2)