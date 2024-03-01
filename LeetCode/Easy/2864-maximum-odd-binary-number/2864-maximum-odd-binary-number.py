class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        count = 0
        
        for v in s:
            if v == "1":
                count += 1
        
        return "1" * (count - 1) + "0" * (len(s) - count) + "1"