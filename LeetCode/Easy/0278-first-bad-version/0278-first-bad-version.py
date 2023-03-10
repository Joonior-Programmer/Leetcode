# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        good_max = 0
        bad_min = n
        while bad_min != good_max + 1:
            mid = (good_max + bad_min) // 2
            ret = isBadVersion(mid)
            if ret:
                bad_min = mid
            else:
                good_max = mid
        return bad_min
