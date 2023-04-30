class Solution:
    def reverseWords(self, s: str) -> str:
        splitted = s.split()
        ret = [v[::-1] for v in splitted]
        return " ".join(ret)
        