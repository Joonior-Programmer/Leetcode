class Solution:
    def reverseWords(self, s: str) -> str:
        return " ".join([v[::-1] for v in s.split()])
        