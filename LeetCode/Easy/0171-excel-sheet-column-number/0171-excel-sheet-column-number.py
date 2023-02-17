class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        ret = 0
        power = len(columnTitle) - 1
        for i in range(len(columnTitle)):
            ret += (ord(columnTitle[i]) - 64) * 26 ** power
            power -= 1
        return ret