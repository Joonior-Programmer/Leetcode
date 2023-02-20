class Solution:
    def reverseBits(self, n: int) -> int:
            # 0001 = 1
            # 1000 = 8
#         v = ""
#         for i in range(31, -1, -1):
#             temp = 2 ** i
#             if n >= temp:
#                 v = "1" + v
#                 n -= temp
#             else:
#                 v = "0" + v

#         return int(v, 2)
        # v = bin(n)[2:]

        # for i in range(32-len(v)):
        #     v = "0" + v
        
        
        # return int("".join(reversed(list(v))), 2)
        ret = 0
        for i in range(32):
            ret <<= 1
            ret |= n & 1
            n >>= 1
        return ret