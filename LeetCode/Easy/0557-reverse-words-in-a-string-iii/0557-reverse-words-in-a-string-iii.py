class Solution:
    def reverseWords(self, s: str) -> str:
        splitted = s.split()
        ret = []
        for v in splitted:
            ret.append(v[::-1])
        return " ".join(ret)
        