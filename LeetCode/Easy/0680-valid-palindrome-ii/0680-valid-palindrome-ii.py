class Solution:
    def validPalindrome(self, s: str) -> bool:
        for i in range(0, len(s) // 2):
            if s[i] != s[-(i+1)]:
                return s[:i] + s[i+1:] == (s[:i] + s[i+1:])[::-1] or s[:len(s)-i-1]+s[len(s)-i:] == (s[:len(s)-i-1]+s[len(s)-i:])[::-1]
        return True