class Solution:
    def sortSentence(self, s: str) -> str:
        s = s.split()
        s.sort(key=lambda x:x[-1])
        return " ".join([v[:-1] for v in s])