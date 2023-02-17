class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        ret = 0
        power = len(columnTitle)
        for i in range(power):
            power -= 1
            ret += (ord(columnTitle[i]) - 64) * 26 ** power
        return ret