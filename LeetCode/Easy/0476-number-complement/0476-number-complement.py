class Solution:
    def findComplement(self, num: int) -> int:
        ret = 0
        temp = num
        while temp:
            ret += 1
            temp >>= 1
        return num ^ (2 ** ret - 1)