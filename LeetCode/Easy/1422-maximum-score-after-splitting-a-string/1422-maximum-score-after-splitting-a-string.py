class Solution:
    def maxScore(self, s: str) -> int:
        ret = 0
        
        for i in range(1, len(s)):
            ret = max(ret, s[:i].count("0") + s[i:].count("1"))
        
        return ret