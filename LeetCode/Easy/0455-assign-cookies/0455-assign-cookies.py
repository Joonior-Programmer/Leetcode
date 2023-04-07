class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        g.sort(reverse=True)
        s.sort(reverse=True)
        i, j, ret = len(g) - 1, len(s) - 1, 0
        while i > -1 and j > -1:
            if g[i] <= s[j]:
                i -= 1
                ret += 1
            j -= 1
        return ret