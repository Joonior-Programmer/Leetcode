class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        l, r = 1, num
        while l < r:
            mid = (l + r) // 2
            if mid * mid == num: return True
            elif mid * mid < num: l = mid + 1
            else: r = mid
        if num * num == num: return True
        return False