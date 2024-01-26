class Solution:
    def sumBase(self, n: int, k: int) -> int:
        ret = 0
        i = 7
        
        while n < k ** i:
            i -= 1

        while i:
            ret += n // k ** i
            n -= n // (k ** i) * (k ** i)
            i -= 1

        return ret + n