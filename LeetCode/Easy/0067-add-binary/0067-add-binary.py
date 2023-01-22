class Solution:
    def addBinary(self, a: str, b: str) -> str:
        # add = 0
        # ret = ""
        # while a or b:
        #     temp = add
        #     add = 0
        #     if a:
        #         temp += int(a[-1])
        #         a = a[:-1]
        #     if b:
        #         temp += int(b[-1])
        #         b = b[:-1]
            
        #     if temp > 1:
        #         add = 1
        #         temp %= 2
            
        #     ret = str(temp) + ret
        

        # return ret if add == 0 else "1" + ret

        return bin(int(a, 2) + int(b, 2))[2:]