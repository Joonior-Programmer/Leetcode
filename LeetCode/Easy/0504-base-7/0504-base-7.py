class Solution:
    def convertToBase7(self, num: int) -> str:
        if not num:
            return "0"

        ret = ""
        is_negative = False

        if num < 0:
            is_negative = True
            num *= -1
        power = 8
        
        for i in range(power, -1, -1):
            if num // (7 ** power) != 0:
                break
            power -= 1

        while power > -1:
            ret += str(num // (7 ** power))
            num = num % (7 ** power)
            power -= 1
        return ret if not is_negative else "-" + ret