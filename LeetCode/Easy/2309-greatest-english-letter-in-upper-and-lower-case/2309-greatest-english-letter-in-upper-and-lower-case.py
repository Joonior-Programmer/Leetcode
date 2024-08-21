class Solution:
    def greatestLetter(self, s: str) -> str:
        lower = [False] * 26
        upper = [False] * 26
        
        for v in s:
            temp = ord(v)
            
            if temp > 96:
                lower[temp-97] = True
            else:
                upper[temp-65] = True
        
        for i in range(25, -1, -1):
            if lower[i] and upper[i]:
                return chr(i+65)
        
        return ""