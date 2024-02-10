class Solution:
    def countSubstrings(self, s: str) -> int:
        ret = len(s)
        
        for i in range(len(s)-1):
            l, r = i-1, i+1

            while (l > -1 and r < len(s)):
                if s[l] == s[r]:
                    ret += 1
                else:
                    break
                l -= 1
                r += 1
            
            l, r = i, i+1

            while (l > -1 and r < len(s)):
                if s[l] == s[r]:
                    ret += 1
                else:
                    break
                l -= 1
                r += 1

        return ret