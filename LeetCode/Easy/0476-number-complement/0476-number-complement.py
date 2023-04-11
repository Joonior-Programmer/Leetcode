class Solution:
    def findComplement(self, num: int) -> int:
        ret = 0
        temp = 1
        while num:
            if num & 1 == 0:
                ret += temp
            temp *= 2
            num >>= 1
        return ret