# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        good_max = 0
        bad_min = n
        mid = (good_max + bad_min) // 2
        while bad_min != good_max + 1:
            if isBadVersion(mid):
                bad_min = mid
            else:
                good_max = mid
            mid = (good_max + bad_min) // 2
        return bad_min
