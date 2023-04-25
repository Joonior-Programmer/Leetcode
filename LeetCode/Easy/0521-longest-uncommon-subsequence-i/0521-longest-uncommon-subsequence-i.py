class Solution:
    def findLUSlength(self, a: str, b: str) -> int:
        if len(a) == len(b) and (a in b or b in a):
            return -1
        return len(a) if len(a) > len(b) else len(b)
        
                    
