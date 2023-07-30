class Solution:
    def intToRoman(self, num: int) -> str:
        ret = ""

        ret += "M" * (num // 1000)
        num %= 1000
        
        if num // 900 > 0:
            ret += "CM"
            num -= 900
        
        if num // 500 > 0:
            ret += "D"
            num -= 500
        
        if num // 400 > 0:
            ret += "CD"
            num -= 400
        
        ret += "C" * (num // 100)
        num %= 100

        if num // 90 > 0:
            ret += "XC"
            num -= 90
        
        if num // 50 > 0:
            ret += "L"
            num -= 50
        
        if num // 40 > 0:
            ret += "XL"
            num -= 40
        
        ret += "X" * (num // 10)
        num %= 10

        if num // 9 > 0:
            ret += "IX"
            num -= 9
        
        if num // 5 > 0:
            ret += "V"
            num -= 5
        
        if num // 4 > 0:
            ret += "IV"
            num -= 4
        
        ret += "I" * (num // 1)

        return ret

