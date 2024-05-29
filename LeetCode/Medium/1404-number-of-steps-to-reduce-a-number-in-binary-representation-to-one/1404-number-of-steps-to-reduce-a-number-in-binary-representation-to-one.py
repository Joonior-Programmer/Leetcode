class Solution:
    def numSteps(self, s: str) -> int:
        curr = 0
        ret = 0
        
        for v in s:
            curr = curr * 2 + int(v)
        
        while curr > 1:
            if curr % 2:
                ret += 2
                curr = (curr + 1) // 2
            else:
                ret += 1
                curr //= 2
        
        return ret