class Solution:
    def minSteps(self, n: int) -> int:
        ret = 0

        while not n % 2:
            ret += 2
            n //= 2
        
        for i in range(3, int(n**0.5)+1, 2):
            while not n % i:
                ret += i
                n //= i

        if n > 1:
            ret += n

        return ret