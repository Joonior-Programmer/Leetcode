class Solution:
    def sequentialDigits(self, low: int, high: int) -> List[int]:
        ret = []
        
        for i in range(1, 10):
            j = i + 1
            temp = i
            while temp < high and j < 10:
                if temp >= low and temp <= high:
                    ret.append(temp)
                temp = (temp * 10) + j
                j += 1
                
            if temp >= low and temp <= high:
                ret.append(temp)
        
        return sorted(ret)