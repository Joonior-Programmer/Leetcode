class Solution:
    def freqAlphabets(self, s: str) -> str:
        ret = ""
        i = 0 

        while i < len(s):
            if i+2 < len(s) and s[i+2] == "#":
                temp = int(s[i:i+2])
                ret += chr(temp + 96)
                i += 3
            else:
                temp = int(s[i])
                ret += chr(temp+96)
                i += 1
                
        return ret