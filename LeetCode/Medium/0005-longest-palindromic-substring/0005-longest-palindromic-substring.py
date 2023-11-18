class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        ret_l = 0
        ret_r = 0

        for i in range(n):
            l, r = i, i

            while l > -1 and r < n and s[l] == s[r]:
                if r - l > ret_r - ret_l:
                    ret_l = l
                    ret_r = r
                l -= 1
                r += 1
            
            l, r = i, i + 1

            while l > -1 and r < n and s[l] == s[r]:
                if r - l > ret_r - ret_l:
                    ret_l = l
                    ret_r = r
                    
                l -= 1
                r += 1
        
        return s[ret_l:ret_r+1]