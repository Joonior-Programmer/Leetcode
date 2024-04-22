class Solution:
    def scoreOfString(self, s: str) -> int:
        ret = 0
        prev = ord(s[0])
    
        for i in range(1, len(s)):
            temp = ord(s[i])
            ret += abs(prev - temp)
            prev = temp

        return ret