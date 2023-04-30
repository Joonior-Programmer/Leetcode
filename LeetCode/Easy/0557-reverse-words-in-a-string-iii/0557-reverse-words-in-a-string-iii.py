class Solution:
    def reverseWords(self, s: str) -> str:
        splitted = s.split()
        return " ".join([v[::-1] for v in splitted])
        