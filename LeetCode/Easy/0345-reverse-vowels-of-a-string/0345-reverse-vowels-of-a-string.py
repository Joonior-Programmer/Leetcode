class Solution:
    def reverseVowels(self, s: str) -> str:
        vowel = set(["a","e","i","o","u", "A", "E", "I", "O", "U"])
        i = 0
        j = len(s) - 1
        length = len(s)
        ret = list(s)
        while i < j:
            while i < length - 1 and s[i] not in vowel:
                i += 1
            while j > 0 and s[j] not in vowel:
                j -= 1
            if i < j:
                ret[j] = s[i]
                ret[i] = s[j]
            i += 1
            j -= 1
        return "".join(ret)