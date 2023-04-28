class Solution:
    def checkRecord(self, s: str) -> bool:
        return "LLL" not in s and not Counter(s)["A"] > 1
                 