class Solution:
    def minFlips(self, a: int, b: int, c: int) -> int:
        ret = 0
        while a or b or c:
            if c & 1 == 0:
                ret += (a & 1) + (b & 1)
            elif ((a & 1) | (b & 1)) == 0:
                ret += 1
            
            a >>= 1
            b >>= 1
            c >>= 1
        return ret

        # low performance
        # c = bin(c)[2:]
        # a = bin(a)[2:]
        # b = bin(b)[2:]
        # length = max(len(a), len(b), len(c))
        # if len(a) < length:
        #     a = "0" * (length - len(a)) + a 
        # if len(b) < length:
        #     b = "0" * (length - len(b)) + b
        # if len(c) < length:
        #     c = "0" * (length - len(c)) + c
        
        # i = 0
        # ret = 0
        # while i < len(a):
        #     if c[i] == "0":
        #         if a[i] == "1":
        #             ret += 1
        #         if b[i] == "1":
        #             ret += 1
        #     elif c[i] == "1" and a[i] == "0" and b[i] == "0":
        #         ret += 1
        #     i += 1

        # return ret