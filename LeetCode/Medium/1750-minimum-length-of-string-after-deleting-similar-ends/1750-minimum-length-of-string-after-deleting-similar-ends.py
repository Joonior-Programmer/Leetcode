class Solution:
    def minimumLength(self, s: str) -> int:
        l, r = 0, len(s) - 1
        
        while l < r:
            if s[l] == s[r]:
                temp = s[l]
                
                while l < len(s) and s[l] == temp:
                    l += 1
                    
                while l < r and s[r] == temp:
                    r -= 1
            else:
                break
        
        return max(r - l + 1, 0)