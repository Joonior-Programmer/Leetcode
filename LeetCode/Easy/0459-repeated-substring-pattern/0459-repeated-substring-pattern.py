class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        length = len(s)
        if length == 1:
            return False
        ret = s[0]
        if ret * length == s:
            return True
        for i in range(1, len(s) // 2):
            ret += s[i]
            if length % (i + 1) == 0 and ret * (length // (i+1)) == s:
                return True
        return ret * (length // len(ret)) == s