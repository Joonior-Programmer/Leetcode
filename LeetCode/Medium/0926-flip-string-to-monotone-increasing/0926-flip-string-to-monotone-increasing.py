class Solution:
    def minFlipsMonoIncr(self, s: str) -> int:
        min_diff = ones = 0
        for v in s:
            if v == "1":
                ones += 1
            elif ones > min_diff:
                min_diff += 1 
        return min_diff
        
