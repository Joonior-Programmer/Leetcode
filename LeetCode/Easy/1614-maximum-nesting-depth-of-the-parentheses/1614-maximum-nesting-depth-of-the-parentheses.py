class Solution:
    def maxDepth(self, s: str) -> int:
        ret = 0
        curr = 0

        for v in s:
            if v == '(':
                curr += 1
                if curr > ret:
                    ret = curr
            elif v == ')':
                curr -= 1

        return ret