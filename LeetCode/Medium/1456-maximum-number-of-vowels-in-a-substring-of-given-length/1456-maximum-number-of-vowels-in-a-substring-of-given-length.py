class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowel = set(["a","e","i","o","u"])
        ret = 0
        prev = 0
        temp = 0
        for i in range(k):
            if s[i] in vowel:
                temp += 1

        ret = temp

        if s[prev] in vowel:
            temp -= 1
        prev += 1
        
        for i in range(k, len(s)):
            if s[i] in vowel:
                temp += 1
            ret = max(ret, temp)
            if s[prev] in vowel:
                temp -= 1
            prev += 1
        return ret