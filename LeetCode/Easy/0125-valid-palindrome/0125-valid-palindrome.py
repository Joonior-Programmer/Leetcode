class Solution:
    def isPalindrome(self, s: str) -> bool:
        newChar = ""
        for v in s:
            if v in ascii_lowercase:
                newChar += v
            elif v in ascii_uppercase:
                newChar += v.lower()
            elif v.isdigit():
                newChar += v
        
        return newChar == newChar[::-1]