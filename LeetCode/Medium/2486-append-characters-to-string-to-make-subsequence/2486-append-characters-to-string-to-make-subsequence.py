class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        n = len(s)
        m = len(t)
        j = 0

        for i in range(n):
            if j == m:
                break
            if s[i] == t[j]:
                j += 1

        return m - j