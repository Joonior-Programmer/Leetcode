class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        ret = numBottles
        left = 0

        while numBottles:
            numBottles += left
            left = 0
            ret += (numBottles + left) // numExchange
            left = numBottles % numExchange
            numBottles //= numExchange
        

        return ret