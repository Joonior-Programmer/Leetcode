class Solution:
    def finalString(self, s: str) -> str:
        ret = ""

        for v in s:
            if v == "i":
                ret = ret[::-1]
            else:
                ret += v
                
        return ret