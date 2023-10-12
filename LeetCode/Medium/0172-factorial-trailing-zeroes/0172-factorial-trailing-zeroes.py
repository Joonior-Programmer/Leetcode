class Solution:
    def trailingZeroes(self, n: int) -> int:
        ret = 0

        while n:
            ret += n//5
            n //= 5
            
        return ret