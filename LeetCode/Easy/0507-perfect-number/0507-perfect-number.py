class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num % 2 != 0 or num < 3:
            return False
        ret = 1
        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                ret += i + (num // i)
        return ret == num