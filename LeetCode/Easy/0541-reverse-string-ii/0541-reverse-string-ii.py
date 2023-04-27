class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        ret = ""
        for i in range(0, len(s), k*2):
            ret += s[i:i+k][::-1] + s[i+k:i+k+k]
        return ret