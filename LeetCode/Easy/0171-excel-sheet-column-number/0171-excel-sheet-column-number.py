class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        ret = 0
        i = len(columnTitle) - 1
        for v in columnTitle:
            ret += (ord(v) - 64) * 26 ** i
            i -= 1
        return ret