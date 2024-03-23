class Solution:
    def minimumSum(self, num: int) -> int:
        vals = [0] * 4
        i = 0
        
        while num:
            vals[i] = num % 10
            num //= 10
            i += 1
        
        vals.sort()
        
        ret1 = vals[0]
        ret2 = vals[1]
        ret1 = ret1 * 10 + vals[2]
        ret2 = ret2 * 10 + vals[3]
        
        return ret1 + ret2