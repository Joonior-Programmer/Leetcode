class Solution:
    def removeStars(self, s: str) -> str:
        ret = deque()
        
        for v in s:
            if v != "*":
                ret.append(v)
            else:
                ret.pop()
        
        return "".join(ret)