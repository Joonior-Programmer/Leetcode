class Solution:
    def equalSubstring(self, s: str, t: str, maxCost: int) -> int:
        diff = [abs(ord(s[i]) - ord(t[i])) for i in range(len(s))]
        ret = 0

        l, r, curr = 0, 0, 0

        while r < len(s):
            if curr + diff[r] <= maxCost:
                curr += diff[r]
                r += 1
                ret = max(ret, r - l)
            else:
                curr -= diff[l]
                l += 1
            
        return ret