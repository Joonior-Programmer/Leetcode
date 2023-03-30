class Solution:
    def toHex(self, num: int) -> str:
        hexa = ["0", "1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"]
        ret = ""
        while num != 0 and num != -1:
            ret = hexa[num % 16] + ret
            num //= 16
        if num == -1:
            ret = "f" * (8 - len(ret)) + ret
        return ret if ret else "0"