class Solution:
    def mySqrt(self, x: int) -> int:
        def bs(x):
            if x < 2: return x
            left = 0
            right = x
            while right - left > 1:
                mid = (right + left) // 2
                if mid * mid == x: return mid
                (left, right) = (left, mid) if mid * mid > x else (mid, right)
            return left
        return bs(x)