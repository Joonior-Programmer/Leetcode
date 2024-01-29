class Solution:
    def countKeyChanges(self, s: str) -> int:
        ret = 0
        prev = ord(s[0])
        
        for v in s[1:]:
            temp = ord(v)
            if temp - 32 != prev and temp + 32 != prev and temp != prev:
                ret += 1
            prev = temp
        
        return ret
        
        
