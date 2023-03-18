class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n == 1:
            return True
        if n % 4 != 0:
            return False
        while n >= 4:
            if n % 4 != 0:
                return False
            n //= 4
        return n == 1