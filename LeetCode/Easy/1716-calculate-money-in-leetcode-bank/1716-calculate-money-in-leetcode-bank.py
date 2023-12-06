class Solution:
    def totalMoney(self, n: int) -> int:
        ret = 0
        weeks = n // 7
        n = n % 7

        while n:
            ret += weeks + n
            n -= 1
        
        weeks -= 1

        while weeks > -1:
            ret += 28 + (weeks * 7)
            weeks -= 1

        return ret