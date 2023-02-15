class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        # add = k
        # i = 0
        # for j in range(len(num)-1, -1, -1):
        #     add += num[i] * 10 ** j
        #     i += 1
        # ret = []
        # while add:
        #     ret.append(add % 10)
        #     add //= 10

        ret = []
        length = len(num)
        i = 0
        while k or i < length:
            if i < length:
                k += num[-(i+1)]
            ret.append(k % 10)
            k //= 10
            i += 1
        ret.reverse()
        return ret