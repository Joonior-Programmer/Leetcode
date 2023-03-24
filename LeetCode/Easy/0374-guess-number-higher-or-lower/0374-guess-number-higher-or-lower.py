# The guess API is already defined for you.
# @param num, your guess
# @return -1 if num is higher than the picked number
#          1 if num is lower than the picked number
#          otherwise return 0
# def guess(num: int) -> int:

class Solution:
    def guessNumber(self, n: int) -> int:
        l, r, ret = 0, n, 0

        while ret == 0:
            mid = (l + r) // 2
            where = guess(mid)
            if where == 0:
                ret = mid
            elif where == 1:
                l = mid + 1
            else:
                r = mid
        return ret

        