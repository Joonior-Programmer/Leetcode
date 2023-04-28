class Solution:
    def checkRecord(self, s: str) -> bool:
        return "LLL" not in s and not s.count("A") > 1
                 