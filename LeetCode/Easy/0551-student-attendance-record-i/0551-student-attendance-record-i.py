class Solution:
    def checkRecord(self, s: str) -> bool:
        A = 0
        L = 0
        for v in s:
            if v == "A":
                A += 1
                L = 0
                if A > 1:
                    return False
            elif v == "L":
                L += 1
                if L > 2:
                    return False
            else:
                L = 0
        return True
                 