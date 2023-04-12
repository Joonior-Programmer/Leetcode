class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        s = s.replace("-", "").upper()[::-1]
        ret = ""
        for i in range(0, len(s), k):
            ret += s[i:i+k] + "-"
        ret = ret[:-1]
        return ret[::-1]