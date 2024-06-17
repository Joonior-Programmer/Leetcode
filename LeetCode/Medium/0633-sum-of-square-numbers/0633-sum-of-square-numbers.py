class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        l, r = 0, int(c ** 0.5)
        
        while l <= r:
            temp = l * l + r * r

            if temp == c:
                return True
            elif temp < c:
                l += 1
            else:
                r -= 1
        
        return False