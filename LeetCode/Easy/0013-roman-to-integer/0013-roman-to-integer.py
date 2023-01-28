class Solution:
    def romanToInt(self, s: str) -> int:
        nums = {"I": 1,
        "V": 5,
        "X" : 10,
        "L":50,
        "C": 100,
        "D": 500,
        "M": 1000,
        }

        s = s.replace("IV", "IIII").replace("IX", "VIIII").replace("XL", "XXXX").       replace("XC", "LXXXX").replace("CD", "CCCC").replace("CM", "DCCCC")
        result = 0
        # print(s)
        for v in s:
            result = result + nums[v]
        return result
