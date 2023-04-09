class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        ret = 0
        while x or y:
            if x & 1 != y & 1:
                ret += 1
            x >>= 1
            y >>= 1
        return ret