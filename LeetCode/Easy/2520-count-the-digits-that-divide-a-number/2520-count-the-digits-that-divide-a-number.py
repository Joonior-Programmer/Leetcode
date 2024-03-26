class Solution:
    def countDigits(self, num: int) -> int:
        original = num
        ret = 0

        while num:
            if original % (num % 10) == 0:
                ret += 1
            num //= 10
        
        return ret