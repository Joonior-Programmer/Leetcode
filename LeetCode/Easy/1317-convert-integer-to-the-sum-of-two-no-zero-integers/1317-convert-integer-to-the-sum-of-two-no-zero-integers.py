class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        ret = 0
        
        for i in range(1, n // 2 + 1):
            temp = i

            while temp > 0:
                if temp % 10 == 0:
                    break
                
                temp //= 10
            

            if temp != 0:
                continue;

            temp = n - i

            while temp > 0:
                if temp % 10 == 0:
                    break
                
                temp //= 10
            

            if temp == 0:
                ret = i
                break

        return [ret, n - ret]