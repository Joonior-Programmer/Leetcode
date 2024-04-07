class Solution:
    def sumOfMultiples(self, n: int) -> int:
        ret = 0
        
        for i in range(3, n + 1, 3):
            ret += i

        for i in range(5, n + 1, 5):
            if i % 3 != 0:
                ret += i 
        
        for i in range(7, n + 1, 7):
            if i % 3 != 0 and i % 5 != 0:
                ret += i

        return ret