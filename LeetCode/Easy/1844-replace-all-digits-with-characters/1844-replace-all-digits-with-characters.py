class Solution:
    def replaceDigits(self, s: str) -> str:
        n = len(s)
        char = ["a", "b", "c", "d", "e", "f", "g", 
        "h", "i", "j", "k", "l", "m", "n", "o", "p", 
        "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
        
        return "".join(
            [s[i] if s[i] not in "0123456789" 
            else char[ord(s[i-1]) - 97 + int(s[i])] 
            for i in range(n)])
