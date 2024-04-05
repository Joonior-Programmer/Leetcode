class Solution:
    def makeGood(self, s: str) -> str:
        ret = []
        
        for v in s:
            if ret and abs(ord(ret[-1]) - ord(v)) == 32:
                ret.pop()
            else:
                ret.append(v)
                
        return "".join(ret)