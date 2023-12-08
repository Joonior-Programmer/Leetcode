class Solution:
    def largestOddNumber(self, num: str) -> str:
        i = len(num) - 1
        odds = "13579"
        ret = ""
        
        while i > -1:
            if num[i] in odds:
                ret = num[:i+1]
                break
            i -= 1
        
        return ret
        