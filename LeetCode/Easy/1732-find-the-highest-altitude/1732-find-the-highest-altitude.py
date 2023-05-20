class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        cur = 0
        ret = 0

        for v in gain:
            cur += v
            ret = max(ret, cur)

        return ret