class Solution:
    def countBits(self, n: int) -> List[int]:
        if n == 0:
            return [0]
        if n == 1:
            return [0, 1]
        ret = [0, 1]
        i = 2
        n += 1
        while n > i:
            if n >= i * 2:
                ret += [i + 1 for i in ret]
                i *= 2
            else:
                ret += [ret[i] + 1 for i in range(n - i)]
                i *= 2
        return ret
            
            

