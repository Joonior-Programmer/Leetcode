class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.strip()
        result = 0
        isMinus = False
        isPlus = False
        isZero = False
        for v in s:
            if v == "-" and result == 0 and not isPlus and not isZero and not isMinus:
                isMinus = True
                continue
            if result == 0 and v == "+" and not isMinus and not isZero and not isPlus:
                isPlus = True
                continue
            if result == 0 and v == "0":
                isZero = True
                continue
            if v >= "0" and v <= "9":
                result = result * 10 + int(v)
            else:
                break
        if isMinus:
            result *= -1
        if result < -2147483648:
            return -2147483648
        if result > 2147483647:
            return 2147483647
        
        return result
