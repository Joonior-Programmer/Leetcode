class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        n = len(s)
        i = 0

        while i < n:
            if s[i] == ' ':
                k -= 1
                if k == 0:
                    break
            i += 1

        return s[:i]
        