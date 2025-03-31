class Solution:
    def calculateTax(self, brackets: List[List[int]], income: int) -> float:
        ret = prev = 0
        for upper, tax in brackets:
            if income <= 0:
                break
            temp = min(upper - prev, income)
            ret += temp * tax / 100
            income -= temp
            prev = upper
        
        return ret