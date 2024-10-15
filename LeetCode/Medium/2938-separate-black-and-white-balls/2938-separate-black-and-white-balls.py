class Solution:
    def minimumSteps(self, s: str) -> int:
        curr = 0
        ret = 0

        for v in s:
            if v == "1":
                curr += 1
            else:
                ret += curr

        return ret